package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Pepperl_Fuchs device specifications for Android Compose previews.
 *
 * This extension provides Pepperl_Fuchs device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PepperlFuchs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PepperlFuchs: Any
  get() = object {
      /** DeviceSpec(manufacturer=Pepperl_Fuchs, code=Smart-Ex03, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pepperl_Fuchs, code=Smart-Ex03,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val SMART_EX03 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
