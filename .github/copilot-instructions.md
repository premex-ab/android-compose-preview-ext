# Copilot Instructions for Android Compose Preview Extensions

This repository contains a Kotlin library that provides extended device specifications for Android Compose previews.

## Project Structure

```
android-compose-preview-ext/
├── android-compose-preview-ext/                          # Main Kotlin library module
│   ├── src/main/kotlin/             # Source code
│   │   └── se/premex/compose/preview/
│   │       └── kt           # Main device specifications
│   └── src/test/kotlin/             # Test files
├── scripts/                         # Automation scripts
│   └── update-devices.sh           # Device update automation
├── .github/workflows/              # GitHub Actions
│   ├── ci.yml                     # Build and test
│   ├── publish.yml                # Publishing workflow  
│   └── update-devices.yml         # Automated device updates
└── README.md                      # Documentation
```

## Key Components

### Device Specifications (`kt`)
- Contains device specifications in two formats:
  - Google devices: `id:` format (e.g., `"id:pixel_8"`)
  - Third-party devices: `spec:` format (e.g., `"spec:width=720px,height=1280px,dpi=294"`)
- Organized by manufacturer using nested objects (e.g., `Devices.Zebra.TC26`)
- Supports Google, Zebra, Samsung, Honeywell, and Datalogic devices

### Automation
- **Update Script** (`update-devices.sh`): Updates device specifications automatically
- **GitHub Actions**: Automated testing, publishing, and weekly device updates
- **Publishing**: Automated release to GitHub Packages

## Development Guidelines

### Adding New Devices
1. Update device arrays in `scripts/update-devices.sh`
2. Run `./scripts/update-devices.sh` to regenerate `kt`
3. Run tests with `./gradlew test`
4. Update tests in `DevicesTest.kt` if needed

### Code Style
- Use Kotlin conventions
- Add KDoc comments for public APIs
- Follow existing naming patterns for device constants
- Use SCREAMING_SNAKE_CASE for device constants

### Testing
- All device specifications must be tested
- Tests validate format and structure
- Build must pass before committing
- Use `./gradlew build test` to validate changes

### Documentation
- Keep README.md updated with new devices
- Document usage examples for new manufacturers
- Update device counts in documentation

## Common Tasks

### Build and Test
```bash
./gradlew build test
```

### Update Device Specifications
```bash
# Dry run to see changes
./scripts/update-devices.sh --dry-run

# Apply updates
./scripts/update-devices.sh
```

### Publishing
- Releases are automated via GitHub releases
- Manual publishing available through GitHub Actions
- Version numbers follow semantic versioning

## Important Files to Modify

1. **`kt`** - Use the update script, don't edit directly
2. **`update-devices.sh`** - Add new devices here
3. **`DevicesTest.kt`** - Add tests for new manufacturers
4. **`README.md`** - Update documentation and device counts

## Quality Guidelines

- All devices must have accurate specifications
- Specs should match manufacturer documentation  
- Test coverage must be maintained
- Documentation must be kept current
- Automation scripts must be maintained

This library serves enterprise and consumer Android development by providing accurate device specifications for Compose previews across major manufacturers.