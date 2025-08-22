package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cloud_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Cloud_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CloudMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CloudMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cloud_Mobile, code=Stratus_C7, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cloud_Mobile, code=Stratus_C7,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val STRATUS_C7 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Cloud_Mobile, code=Stratus_C8, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cloud_Mobile, code=Stratus_C8,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val STRATUS_C8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cloud_Mobile, code=Sunshine_T2_Elite, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cloud_Mobile,
      code=Sunshine_T2_Elite, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SUNSHINE_T2_ELITE = "spec:width=800,height=1280,unit=px,dpi=213"

  }
