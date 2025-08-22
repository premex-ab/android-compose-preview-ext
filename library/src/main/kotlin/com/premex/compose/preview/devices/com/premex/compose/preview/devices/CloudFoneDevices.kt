package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CloudFone device specifications for Android Compose previews.
 *
 * This extension provides CloudFone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CloudFone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CloudFone: Any
  get() = object {
      /** DeviceSpec(manufacturer=CloudFone, code=Excite_Prime_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CloudFone, code=Excite_Prime_2,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val EXCITE_PRIME_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CloudFone, code=Next_Infinity_Plus, width=720, height=1440,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CloudFone,
      code=Next_Infinity_Plus, width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val NEXT_INFINITY_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CloudFone, code=Next_Infinity_Pro, width=720, height=1440,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CloudFone,
      code=Next_Infinity_Pro, width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val NEXT_INFINITY_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CloudFone, code=Thrill_Boost_2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CloudFone, code=Thrill_Boost_2,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val THRILL_BOOST_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CloudFone, code=Thrill_Boost_3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CloudFone, code=Thrill_Boost_3,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val THRILL_BOOST_3 = "spec:width=480,height=960,unit=px,dpi=240"

  }
