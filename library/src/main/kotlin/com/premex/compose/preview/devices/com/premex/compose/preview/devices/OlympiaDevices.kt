package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Olympia device specifications for Android Compose previews.
 *
 * This extension provides Olympia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Olympia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Olympia: Any
  get() = object {
      /** DeviceSpec(manufacturer=Olympia, code=NEO, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Olympia, code=NEO, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NEO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Olympia, code=NEO_Mini, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Olympia, code=NEO_Mini, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NEO_MINI = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Olympia, code=TREK, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Olympia, code=TREK, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TREK = "spec:width=720,height=1440,unit=px,dpi=320"

  }
