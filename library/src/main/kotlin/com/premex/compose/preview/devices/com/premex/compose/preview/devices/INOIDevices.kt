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
 * @Preview(device = Devices.INOI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.INOI: Any
  get() = object {
      /** DeviceSpec(manufacturer=INOI, code=A126, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=A126, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A126 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=A150, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=A150, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val A150 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=INOI, code=A151, width=720, height=1600, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=A151, width=720,
      height=1600, dpi=260, isGoogleDevice=false).code */
      val A151 = "spec:width=720,height=1600,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=INOI, code=A160, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=A160, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A160 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=A161, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=A161, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A161 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=A161_Plus, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=A161_Plus, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A161_PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=A170, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=A170, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A170 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=A171, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=A171, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A171 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=A180, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=A180, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val A180 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=A181, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=A181, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A181 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=easyphone, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=easyphone, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val EASYPHONE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INOI, code=inoiPad, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=inoiPad, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val INOIPAD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=INOI, code=inoiPad_mini_3G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=inoiPad_mini_3G,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val INOIPAD_MINI_3G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=INOI, code=inoiPad_mini_Wi-Fi, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=inoiPad_mini_Wi-Fi,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val INOIPAD_MINI_WI_FI = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=INOI, code=inoiPad_Pro, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=inoiPad_Pro, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val INOIPAD_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=INOI, code=INOI_1_Lite, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_1_Lite, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val INOI_1_LITE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INOI, code=INOI_2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_2, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val INOI_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INOI, code=INOI_2_2019, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_2_2019, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val INOI_2_2019 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INOI, code=INOI_2_2021, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_2_2021, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val INOI_2_2021 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=INOI, code=INOI_2_LITE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_2_LITE, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val INOI_2_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INOI, code=INOI_2_Lite_2019, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_2_Lite_2019,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val INOI_2_LITE_2019 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INOI, code=INOI_2_Lite_2021, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_2_Lite_2021,
      width=480, height=854, dpi=213, isGoogleDevice=false).code */
      val INOI_2_LITE_2021 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=INOI, code=INOI_3, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_3, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val INOI_3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=INOI, code=INOI_3_LITE, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_3_LITE, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val INOI_3_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INOI, code=INOI_3_POWER, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_3_POWER, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val INOI_3_POWER = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INOI, code=INOI_5i, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_5i, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val INOI_5I = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=INOI_5i_Lite, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_5i_Lite, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val INOI_5I_LITE = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=INOI_5_2021, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_5_2021, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val INOI_5_2021 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=INOI, code=INOI_5_Lite_2021, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_5_Lite_2021,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val INOI_5_LITE_2021 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=INOI, code=INOI_5_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_5_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val INOI_5_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=INOI_6i, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_6i, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val INOI_6I = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=INOI_6i_Lite, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_6i_Lite, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val INOI_6I_LITE = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=INOI_7i, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_7i, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val INOI_7I = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INOI, code=INOI_7_2020, width=720, height=1520, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_7_2020, width=720,
      height=1520, dpi=340, isGoogleDevice=false).code */
      val INOI_7_2020 = "spec:width=720,height=1520,unit=px,dpi=340"

      /** DeviceSpec(manufacturer=INOI, code=INOI_7_4_64_2021, width=720, height=1520, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_7_4_64_2021,
      width=720, height=1520, dpi=340, isGoogleDevice=false).code */
      val INOI_7_4_64_2021 = "spec:width=720,height=1520,unit=px,dpi=340"

      /** DeviceSpec(manufacturer=INOI, code=INOI_A14, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_A14, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val INOI_A14 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=INOI, code=INOI_A34, width=720, height=1600, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_A34, width=720,
      height=1600, dpi=260, isGoogleDevice=false).code */
      val INOI_A34 = "spec:width=720,height=1600,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=INOI, code=INOI_A35_Adventure, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_A35_Adventure,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val INOI_A35_ADVENTURE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=INOI_A75_Elegance, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=INOI_A75_Elegance,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val INOI_A75_ELEGANCE = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=INOI, code=Note_13s, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=Note_13s, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val NOTE_13S = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INOI, code=T100, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=T100, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val T100 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=INOI, code=T107, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=T107, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val T107 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=INOI, code=T107_Plus, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=T107_Plus, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T107_PLUS = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=INOI, code=T108, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=T108, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val T108 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=INOI, code=T109, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INOI, code=T109, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val T109 = "spec:width=1600,height=2560,unit=px,dpi=320"

  }
