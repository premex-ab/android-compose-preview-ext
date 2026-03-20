# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Kotlin library providing 24,000+ device specifications for Android Jetpack Compose `@Preview` annotations. One Kotlin object per manufacturer (e.g., `Zebra`, `Samsung`), each containing `const val` device specs. The library is published to Maven Central under `se.premex.compose.preview:android-compose-preview-ext`.

## Build Commands

```bash
./gradlew build                    # Compile library + generator (~45s)
./gradlew test                     # Run tests (~1-2s after build)
./gradlew :device-generator:run    # Regenerate device files from CSV (~5s, needs internet)
./gradlew clean build test         # Full validation
```

Run a single test:
```bash
./gradlew test --tests UsageExamplesTest
```

Publish locally for testing:
```bash
./gradlew :android-compose-preview-ext:publishToMavenLocal
```

**Requirements:** JDK 17+ (toolchain targets 21), Gradle 9.0.0 (via wrapper).

## Architecture

Two Gradle modules:

- **android-compose-preview-ext/** — Published library. Contains generated Kotlin objects with device spec constants. No runtime dependencies. Tests in `src/test/kotlin/.../UsageExamplesTest.kt`.
- **device-generator/** — CLI app that downloads a CSV from [android-device-catalog-parser](https://github.com/hossain-khan/android-device-catalog-parser), then generates:
  - Kotlin source files (one per manufacturer, ~2,668 files, ~145k lines) into `android-compose-preview-ext/src/main/kotlin/.../android/`
  - Markdown docs (one per manufacturer) into `docs/devices/`
  - Updated stats in `README.md` between `<!-- SUPPORTED_DEVICE_STATS_START -->` markers

### Generator pipeline

`DeviceFetcher` (CSV download + parse) → `DeviceCatalogGenerator` (KotlinPoet code gen) + `DeviceDocsGenerator` (markdown gen)

### Device spec formats

- Non-Google devices: `spec:width=1080px,height=2160px,dpi=480`
- Google devices: `id:pixel_8` (official Android Studio IDs)

### Naming conflict resolution (priority order)

Base name → `_1080X2160` suffix → `_480DPI` suffix → `_A1B2C3` hash → `_2` counter

## Development Workflow

1. Make changes to generator or library code
2. If generator was modified: `./gradlew :device-generator:run`
3. `./gradlew build test` — must pass
4. Commit including any regenerated files (they are checked in)

## CI/CD

- **ci.yml** — Build + test on push/PR to main
- **update-devices.yml** — Weekly (Sunday 6:00 UTC) device catalog refresh, auto-creates PR
- **publish.yml** — Maven Central publish on GitHub release (GPG signed)
- **snapshot.yml** — Snapshot publish on main push
- All workflows use JDK 21 on `tart` runner

## Conventions

- Package: `se.premex.compose.preview.device.catalog.android`
- Generated objects: PascalCase manufacturer name (`public object Zebra`)
- Generated constants: UPPER_SNAKE_CASE (`public const val TC27: String`)
- Device code sanitization: non-alphanumeric → underscore, collapse duplicates, digit prefix gets `_`
- No lint/format tools configured — standard Kotlin compilation only
- Deprecation warnings during build are safe to ignore
