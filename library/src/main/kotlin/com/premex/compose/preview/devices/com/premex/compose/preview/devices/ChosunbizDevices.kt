package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Chosunbiz device specifications for Android Compose previews.
 *
 * This extension provides Chosunbiz device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Chosunbiz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Chosunbiz: Any
  get() = object {
      /** DeviceSpec(manufacturer=Chosunbiz, code=kPad, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Chosunbiz, code=kPad, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KPAD = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
