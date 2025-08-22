package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fxtec device specifications for Android Compose previews.
 *
 * This extension provides Fxtec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fxtec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fxtec: Any
  get() = object {
      /** DeviceSpec(manufacturer=Fxtec, code=QX1000, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fxtec, code=QX1000, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val QX1000 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
