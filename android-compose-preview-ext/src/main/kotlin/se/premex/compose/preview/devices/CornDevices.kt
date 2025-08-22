package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CORN device specifications for Android Compose previews.
 *
 * This extension provides CORN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Corn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Corn: Any
  get() = object {
      /** CORN C5 */
      val C5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** CORN C55 */
      val C55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** CORN C55_Pro */
      val C55_PRO = "spec:width=480,height=960,unit=px,dpi=213"

      /** CORN C60 */
      val C60 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** CORN C60_Ultra */
      val C60_ULTRA = "spec:width=720,height=1520,unit=px,dpi=320"

      /** CORN Coco10_Ultra_4G */
      val COCO10_ULTRA_4G = "spec:width=720,height=1600,unit=px,dpi=480"

      /** CORN CORN_R10 */
      val CORN_R10 = "spec:width=480,height=854,unit=px,dpi=213"

      /** CORN Corn_Star8 */
      val CORN_STAR8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CORN CORN_X5 */
      val CORN_X5 = "spec:width=480,height=854,unit=px,dpi=200"

      /** CORN CORN_X55 */
      val CORN_X55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** CORN G60 */
      val G60 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** CORN G60_Pro_4G */
      val G60_PRO_4G = "spec:width=480,height=1014,unit=px,dpi=200"

      /** CORN Note1 */
      val NOTE1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** CORN Play25_Pro_4G */
      val PLAY25_PRO_4G = "spec:width=720,height=1612,unit=px,dpi=320"

      /** CORN R10E */
      val R10E = "spec:width=540,height=960,unit=px,dpi=240"

      /** CORN R10S */
      val R10S = "spec:width=480,height=854,unit=px,dpi=240"

      /** CORN R20 */
      val R20 = "spec:width=480,height=960,unit=px,dpi=240"

      /** CORN R40 */
      val R40 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** CORN Star10_3G */
      val STAR10_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CORN Star10_Pro */
      val STAR10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** CORN Star8 */
      val STAR8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** CORN Star8_3G */
      val STAR8_3G = "spec:width=600,height=1024,unit=px,dpi=220"

      /** CORN Tronik_12 */
      val TRONIK_12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** CORN Tronik_12S */
      val TRONIK_12S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** CORN Tronik_13S */
      val TRONIK_13S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** CORN X5S */
      val X5S = "spec:width=540,height=960,unit=px,dpi=240"

      /** CORN X60 */
      val X60 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** CORN Y60 */
      val Y60 = "spec:width=480,height=1014,unit=px,dpi=200"

  }
