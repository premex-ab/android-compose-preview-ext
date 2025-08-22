package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LT_Mobile device specifications for Android Compose previews.
 *
 * This extension provides LT_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LTMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LTMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=LT_Mobile, code=LT_2003, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT_Mobile, code=LT_2003, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LT_2003 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT_Mobile, code=LT_Mobile_E6707, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT_Mobile, code=LT_Mobile_E6707,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val LT_MOBILE_E6707 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
