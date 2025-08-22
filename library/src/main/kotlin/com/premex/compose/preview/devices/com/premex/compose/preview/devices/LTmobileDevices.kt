package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LT_mobile device specifications for Android Compose previews.
 *
 * This extension provides LT_mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LTmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LTmobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=LT_mobile, code=LT_mobile_C26, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT_mobile, code=LT_mobile_C26,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val LT_MOBILE_C26 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT_mobile, code=LT_mobile_C60, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT_mobile, code=LT_mobile_C60,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val LT_MOBILE_C60 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT_mobile, code=LT_mobile_E16, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT_mobile, code=LT_mobile_E16,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val LT_MOBILE_E16 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT_mobile, code=LT_mobile_E18, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT_mobile, code=LT_mobile_E18,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val LT_MOBILE_E18 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT_mobile, code=LT_mobile_S22, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT_mobile, code=LT_mobile_S22,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val LT_MOBILE_S22 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT_mobile, code=LT_mobile_S33, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT_mobile, code=LT_mobile_S33,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val LT_MOBILE_S33 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
