package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POPTEL device specifications for Android Compose previews.
 *
 * This extension provides POPTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.POPTEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.POPTEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=POPTEL, code=P10, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POPTEL, code=P10, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P10 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POPTEL, code=P60, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POPTEL, code=P60, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val P60 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=POPTEL, code=P8, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POPTEL, code=P8, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P8 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=POPTEL, code=P9000_MAX, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POPTEL, code=P9000_MAX, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P9000_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=POPTEL, code=V9, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POPTEL, code=V9, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V9 = "spec:width=800,height=1280,unit=px,dpi=320"

  }
