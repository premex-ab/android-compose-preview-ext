package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HERO device specifications for Android Compose previews.
 *
 * This extension provides HERO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HERO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HERO: Any
  get() = object {
      /** DeviceSpec(manufacturer=HERO, code=HERO_4ALL, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HERO, code=HERO_4ALL, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val HERO_4ALL = "spec:width=480,height=960,unit=px,dpi=240"

  }
