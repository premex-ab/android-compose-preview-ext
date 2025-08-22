package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Xtouch device specifications for Android Compose previews.
 *
 * This extension provides Xtouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xtouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xtouch: Any
  get() = object {
      /** DeviceSpec(manufacturer=Xtouch, code=S40, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xtouch, code=S40, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val S40 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Xtouch, code=X40, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xtouch, code=X40, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val X40 = "spec:width=480,height=800,unit=px,dpi=240"

  }
