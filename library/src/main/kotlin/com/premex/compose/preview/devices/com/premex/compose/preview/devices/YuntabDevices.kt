package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * yuntab device specifications for Android Compose previews.
 *
 * This extension provides yuntab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yuntab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yuntab: Any
  get() = object {
      /** DeviceSpec(manufacturer=yuntab, code=D107, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=yuntab, code=D107, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val D107 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
