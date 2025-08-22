package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ACE device specifications for Android Compose previews.
 *
 * This extension provides ACE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ace.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ace: Any
  get() = object {
      /** ACE AS0218 */
      val AS0218 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ACE AS0518 */
      val AS0518 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ACE AS0618 */
      val AS0618 = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** ACE BUZZ_1_Lite */
      val BUZZ_1_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** ACE BUZZ_1_Plus */
      val BUZZ_1_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ACE BUZZ_2 */
      val BUZZ_2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** ACE BUZZ_2_Plus */
      val BUZZ_2_PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** ACE BUZZ_3 */
      val BUZZ_3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ACE BUZZ_3E */
      val BUZZ_3E = "spec:width=480,height=960,unit=px,dpi=200"

      /** ACE BUZZ_3_Lite */
      val BUZZ_3_LITE = "spec:width=720,height=1600,unit=px,dpi=300"

      /** ACE BUZZ_3_Plus */
      val BUZZ_3_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ACE BUZZ_4 */
      val BUZZ_4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ACE BUZZ_4Lite */
      val BUZZ_4LITE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** ACE BUZZ_4Pro */
      val BUZZ_4PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ACE BUZZ_4S */
      val BUZZ_4S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ACE BUZZ_4_Note */
      val BUZZ_4_NOTE = "spec:width=720,height=1650,unit=px,dpi=320"

      /** ACE BUZZ_4_Prime */
      val BUZZ_4_PRIME = "spec:width=720,height=1560,unit=px,dpi=280"

      /** ACE BUZZ_4_Ultra */
      val BUZZ_4_ULTRA = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** ACE BUZZ_5_Lite */
      val BUZZ_5_LITE = "spec:width=576,height=1280,unit=px,dpi=213"

      /** ACE BUZZ_5_Note */
      val BUZZ_5_NOTE = "spec:width=720,height=1650,unit=px,dpi=320"

      /** ACE BUZZ_5_Prime */
      val BUZZ_5_PRIME = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ACE BUZZ_5_Pro */
      val BUZZ_5_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ACE BUZZ_5_Pro_PLUS */
      val BUZZ_5_PRO_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ACE BUZZ_5_Ultra */
      val BUZZ_5_ULTRA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** ACE BUZZ_6_Flip */
      val BUZZ_6_FLIP = "spec:width=1080,height=2560,unit=px,dpi=480"

      /** ACE BUZZ_6_Prime */
      val BUZZ_6_PRIME = "spec:width=720,height=1612,unit=px,dpi=320"

      /** ACE BUZZ_6_Prime_PLUS */
      val BUZZ_6_PRIME_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** ACE BUZZ_6_Pro */
      val BUZZ_6_PRO = "spec:width=720,height=1612,unit=px,dpi=480"

      /** ACE BUZZ_6_Pro_PLUS */
      val BUZZ_6_PRO_PLUS = "spec:width=720,height=1604,unit=px,dpi=320"

      /** ACE BUZZ_6_Ultra */
      val BUZZ_6_ULTRA = "spec:width=720,height=1604,unit=px,dpi=320"

      /** ACE BUZZ_7_Lite */
      val BUZZ_7_LITE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** ACE BUZZ_7_Note */
      val BUZZ_7_NOTE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ACE BUZZ_7_Prime */
      val BUZZ_7_PRIME = "spec:width=720,height=1612,unit=px,dpi=320"

      /** ACE BUZZ_7_Prime_PLUS */
      val BUZZ_7_PRIME_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** ACE BUZZ_7_Pro */
      val BUZZ_7_PRO = "spec:width=720,height=1604,unit=px,dpi=320"

      /** ACE BUZZ_7_Ultra */
      val BUZZ_7_ULTRA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** ACE CLEVER_3 */
      val CLEVER_3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ACE URBAN_1 */
      val URBAN_1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ACE URBAN_2 */
      val URBAN_2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** ACE URBAN_3 */
      val URBAN_3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ACE URBAN_3E */
      val URBAN_3E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ACE URBAN_3_PlusE */
      val URBAN_3_PLUSE = "spec:width=720,height=1640,unit=px,dpi=320"

  }
