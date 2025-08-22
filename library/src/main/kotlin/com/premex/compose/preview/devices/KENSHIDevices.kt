package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KENSHI device specifications for Android Compose previews.
 *
 * This extension provides KENSHI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KENSHI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KENSHI: Any
  get() = object {
      /** KENSHI Armor_C1s */
      val ARMOR_C1S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** KENSHI Armor_C1w */
      val ARMOR_C1W = "spec:width=720,height=1600,unit=px,dpi=320"

      /** KENSHI Armor_C1_Max */
      val ARMOR_C1_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KENSHI Armor_H1s */
      val ARMOR_H1S = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** KENSHI Armor_H1w */
      val ARMOR_H1W = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** KENSHI Armor_H2s */
      val ARMOR_H2S = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** KENSHI Armor_I1w */
      val ARMOR_I1W = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** KENSHI Armor_I1_Slim */
      val ARMOR_I1_SLIM = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** KENSHI Armor_I2w */
      val ARMOR_I2W = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** KENSHI Armor_P1s */
      val ARMOR_P1S = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** KENSHI Armor_P1w */
      val ARMOR_P1W = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** KENSHI Armor_P1_Pro */
      val ARMOR_P1_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** KENSHI Armor_V1s */
      val ARMOR_V1S = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** KENSHI E10 */
      val E10 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** KENSHI E11 */
      val E11 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** KENSHI E12 */
      val E12 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** KENSHI E17 */
      val E17 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KENSHI E18 */
      val E18 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KENSHI E28 */
      val E28 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** KENSHI E38 */
      val E38 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KENSHI H10 */
      val H10 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** KENSHI H11 */
      val H11 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** KENSHI H14 */
      val H14 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** KENSHI H15 */
      val H15 = "spec:width=1200,height=1920,unit=px,dpi=480"

      /** KENSHI H16 */
      val H16 = "spec:width=1200,height=1920,unit=px,dpi=480"

      /** KENSHI H17 */
      val H17 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KENSHI H18 */
      val H18 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KENSHI H19 */
      val H19 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KENSHI H20 */
      val H20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KENSHI H21 */
      val H21 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** KENSHI H24 */
      val H24 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** KENSHI H34 */
      val H34 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KENSHI H38 */
      val H38 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** KENSHI H44 */
      val H44 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KENSHI KP10 */
      val KP10 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** KENSHI KP11 */
      val KP11 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** KENSHI O8 */
      val O8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** KENSHI Pad_Lite_E48 */
      val PAD_LITE_E48 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KENSHI Pad_Lite_E58 */
      val PAD_LITE_E58 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** KENSHI Pad_Pro_E110 */
      val PAD_PRO_E110 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** KENSHI Pad_Pro_E111 */
      val PAD_PRO_E111 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** KENSHI Pad_Pro_E112 */
      val PAD_PRO_E112 = "spec:width=1600,height=2560,unit=px,dpi=320"

  }
