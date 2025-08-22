package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * 7mobile device specifications for Android Compose previews.
 *
 * This extension provides 7mobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._7mobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._7mobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=7mobile, code=Swegue_2, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=7mobile, code=Swegue_2, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val SWEGUE_2 = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=7mobile, code=7mobile_Kamba_2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=7mobile, code=7mobile_Kamba_2,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val _7MOBILE_KAMBA_2 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
