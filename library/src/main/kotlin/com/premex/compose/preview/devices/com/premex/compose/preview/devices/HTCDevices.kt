package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Htc device specifications for Android Compose previews.
 *
 * This extension provides Htc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HTC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HTC: Any
  get() = object {
      /** DeviceSpec(manufacturer=Htc, code=htc_a37dj_dugl, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Htc, code=htc_a37dj_dugl,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val HTC_A37DJ_DUGL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Htc, code=htc_a37_dugl, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Htc, code=htc_a37_dugl, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HTC_A37_DUGL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Htc, code=htc_bre2dugl, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Htc, code=htc_bre2dugl, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HTC_BRE2DUGL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Htc, code=htc_bre2exdugl, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Htc, code=htc_bre2exdugl,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val HTC_BRE2EXDUGL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Htc, code=htc_imldugl, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Htc, code=htc_imldugl, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val HTC_IMLDUGL = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
