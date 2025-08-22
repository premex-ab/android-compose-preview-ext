package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * INOI device specifications for Android Compose previews.
 *
 * This extension provides INOI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Inoi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Inoi: Any
  get() = object {
      /** INOI A126 */
      val A126 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** INOI A150 */
      val A150 = "spec:width=480,height=960,unit=px,dpi=213"

      /** INOI A151 */
      val A151 = "spec:width=720,height=1600,unit=px,dpi=260"

      /** INOI A160 */
      val A160 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** INOI A161 */
      val A161 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** INOI A161_Plus */
      val A161_PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** INOI A170 */
      val A170 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** INOI A171 */
      val A171 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** INOI A180 */
      val A180 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** INOI A181 */
      val A181 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** INOI easyphone */
      val EASYPHONE = "spec:width=480,height=960,unit=px,dpi=240"

      /** INOI inoiPad */
      val INOIPAD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** INOI inoiPad_mini_3G */
      val INOIPAD_MINI_3G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** INOI inoiPad_mini_Wi-Fi */
      val INOIPAD_MINI_WI_FI = "spec:width=600,height=1024,unit=px,dpi=213"

      /** INOI inoiPad_Pro */
      val INOIPAD_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** INOI INOI_1_Lite */
      val INOI_1_LITE = "spec:width=480,height=800,unit=px,dpi=240"

      /** INOI INOI_2 */
      val INOI_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** INOI INOI_2_2019 */
      val INOI_2_2019 = "spec:width=480,height=854,unit=px,dpi=240"

      /** INOI INOI_2_2021 */
      val INOI_2_2021 = "spec:width=480,height=854,unit=px,dpi=213"

      /** INOI INOI_2_LITE */
      val INOI_2_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** INOI INOI_2_Lite_2019 */
      val INOI_2_LITE_2019 = "spec:width=480,height=854,unit=px,dpi=240"

      /** INOI INOI_2_Lite_2021 */
      val INOI_2_LITE_2021 = "spec:width=480,height=854,unit=px,dpi=213"

      /** INOI INOI_3 */
      val INOI_3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** INOI INOI_3_LITE */
      val INOI_3_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** INOI INOI_3_POWER */
      val INOI_3_POWER = "spec:width=480,height=960,unit=px,dpi=240"

      /** INOI INOI_5i */
      val INOI_5I = "spec:width=640,height=1280,unit=px,dpi=320"

      /** INOI INOI_5i_Lite */
      val INOI_5I_LITE = "spec:width=640,height=1280,unit=px,dpi=320"

      /** INOI INOI_5_2021 */
      val INOI_5_2021 = "spec:width=480,height=960,unit=px,dpi=213"

      /** INOI INOI_5_Lite_2021 */
      val INOI_5_LITE_2021 = "spec:width=480,height=960,unit=px,dpi=213"

      /** INOI INOI_5_Pro */
      val INOI_5_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** INOI INOI_6i */
      val INOI_6I = "spec:width=640,height=1280,unit=px,dpi=320"

      /** INOI INOI_6i_Lite */
      val INOI_6I_LITE = "spec:width=640,height=1280,unit=px,dpi=320"

      /** INOI INOI_7i */
      val INOI_7I = "spec:width=480,height=996,unit=px,dpi=240"

      /** INOI INOI_7_2020 */
      val INOI_7_2020 = "spec:width=720,height=1520,unit=px,dpi=340"

      /** INOI INOI_7_4_64_2021 */
      val INOI_7_4_64_2021 = "spec:width=720,height=1520,unit=px,dpi=340"

      /** INOI INOI_A14 */
      val INOI_A14 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** INOI INOI_A34 */
      val INOI_A34 = "spec:width=720,height=1600,unit=px,dpi=260"

      /** INOI INOI_A35_Adventure */
      val INOI_A35_ADVENTURE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** INOI INOI_A75_Elegance */
      val INOI_A75_ELEGANCE = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** INOI Note_13s */
      val NOTE_13S = "spec:width=720,height=1640,unit=px,dpi=320"

      /** INOI T100 */
      val T100 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** INOI T107 */
      val T107 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** INOI T107_Plus */
      val T107_PLUS = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** INOI T108 */
      val T108 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** INOI T109 */
      val T109 = "spec:width=1600,height=2560,unit=px,dpi=320"

  }
