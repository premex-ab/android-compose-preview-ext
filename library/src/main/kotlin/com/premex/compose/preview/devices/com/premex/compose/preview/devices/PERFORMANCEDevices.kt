package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PERFORMANCE device specifications for Android Compose previews.
 *
 * This extension provides PERFORMANCE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PERFORMANCE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PERFORMANCE: Any
  get() = object {
      /** DeviceSpec(manufacturer=PERFORMANCE, code=T7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PERFORMANCE, code=T7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PERFORMANCE, code=T9, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PERFORMANCE, code=T9, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T9 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
