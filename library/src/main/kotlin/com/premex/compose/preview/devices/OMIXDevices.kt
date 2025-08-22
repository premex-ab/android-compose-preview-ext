package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OMIX device specifications for Android Compose previews.
 *
 * This extension provides OMIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OMIX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OMIX: Any
  get() = object {
      /** OMIX MixTab_Pro_2 */
      val MIXTAB_PRO_2 = "spec:width=1200,height=2000,unit=px,dpi=360"

      /** OMIX OMIX_X4 */
      val OMIX_X4 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** OMIX X2032 */
      val X2032 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OMIX X3 */
      val X3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OMIX X300 */
      val X300 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OMIX X400 */
      val X400 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** OMIX X5 */
      val X5 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** OMIX X500 */
      val X500 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OMIX X6 */
      val X6 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OMIX X600 */
      val X600 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OMIX X600_NFC */
      val X600_NFC = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OMIX X7 */
      val X7 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OMIX X700 */
      val X700 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
