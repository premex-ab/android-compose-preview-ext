package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Performance device specifications for Android Compose previews.
 *
 * This extension provides Performance device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Performance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Performance: Any
  get() = object {
      /** DeviceSpec(manufacturer=Performance, code=PR7RKTNF, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Performance, code=PR7RKTNF,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PR7RKTNF = "spec:width=600,height=1024,unit=px,dpi=160"

  }
