package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cedar device specifications for Android Compose previews.
 *
 * This extension provides Cedar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cedar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cedar: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cedar, code=CT8X2, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cedar, code=CT8X2, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val CT8X2 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Cedar, code=CT8XEU, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cedar, code=CT8XEU, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val CT8XEU = "spec:width=800,height=1280,unit=px,dpi=240"

  }
