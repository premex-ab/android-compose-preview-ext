package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * i5 device specifications for Android Compose previews.
 *
 * This extension provides i5 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.I5.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.I5: Any
  get() = object {
      /** DeviceSpec(manufacturer=i5, code=V10, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i5, code=V10, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val V10 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=i5, code=10080, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i5, code=10080, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _10080 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
