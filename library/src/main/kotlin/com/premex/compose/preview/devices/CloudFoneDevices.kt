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
      /** CloudFone Excite_Prime_2 */
      val EXCITE_PRIME_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CloudFone Next_Infinity_Plus */
      val NEXT_INFINITY_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CloudFone Next_Infinity_Pro */
      val NEXT_INFINITY_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CloudFone Thrill_Boost_2 */
      val THRILL_BOOST_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** CloudFone Thrill_Boost_3 */
      val THRILL_BOOST_3 = "spec:width=480,height=960,unit=px,dpi=240"

  }
