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
      /** DeviceSpec(manufacturer=KENSHI, code=Armor_C1s, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Armor_C1s, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val ARMOR_C1S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KENSHI, code=Armor_C1w, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Armor_C1w, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ARMOR_C1W = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KENSHI, code=Armor_C1_Max, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Armor_C1_Max,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ARMOR_C1_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KENSHI, code=Armor_H1s, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Armor_H1s, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val ARMOR_H1S = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KENSHI, code=Armor_H1w, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Armor_H1w, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val ARMOR_H1W = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KENSHI, code=Armor_H2s, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Armor_H2s, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val ARMOR_H2S = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KENSHI, code=Armor_I1w, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Armor_I1w, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val ARMOR_I1W = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KENSHI, code=Armor_I1_Slim, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Armor_I1_Slim,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val ARMOR_I1_SLIM = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KENSHI, code=Armor_I2w, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Armor_I2w, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val ARMOR_I2W = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KENSHI, code=Armor_P1s, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Armor_P1s, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val ARMOR_P1S = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KENSHI, code=Armor_P1w, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Armor_P1w, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val ARMOR_P1W = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KENSHI, code=Armor_P1_Pro, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Armor_P1_Pro,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val ARMOR_P1_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KENSHI, code=Armor_V1s, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Armor_V1s, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val ARMOR_V1S = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KENSHI, code=E10, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=E10, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val E10 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KENSHI, code=E11, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=E11, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val E11 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KENSHI, code=E12, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=E12, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val E12 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KENSHI, code=E17, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=E17, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E17 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KENSHI, code=E18, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=E18, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E18 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KENSHI, code=E28, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=E28, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val E28 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=KENSHI, code=E38, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=E38, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val E38 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KENSHI, code=H10, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H10, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val H10 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=KENSHI, code=H11, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H11, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val H11 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=KENSHI, code=H14, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H14, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val H14 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KENSHI, code=H15, width=1200, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H15, width=1200,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val H15 = "spec:width=1200,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KENSHI, code=H16, width=1200, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H16, width=1200,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val H16 = "spec:width=1200,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KENSHI, code=H17, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H17, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val H17 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KENSHI, code=H18, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H18, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val H18 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KENSHI, code=H19, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H19, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val H19 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KENSHI, code=H20, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H20, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val H20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KENSHI, code=H21, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H21, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val H21 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=KENSHI, code=H24, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H24, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val H24 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KENSHI, code=H34, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H34, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val H34 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KENSHI, code=H38, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H38, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val H38 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KENSHI, code=H44, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=H44, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val H44 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KENSHI, code=KP10, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=KP10, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val KP10 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KENSHI, code=KP11, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=KP11, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val KP11 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KENSHI, code=O8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=O8, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val O8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KENSHI, code=Pad_Lite_E48, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Pad_Lite_E48,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PAD_LITE_E48 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KENSHI, code=Pad_Lite_E58, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Pad_Lite_E58,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val PAD_LITE_E58 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KENSHI, code=Pad_Pro_E110, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Pad_Pro_E110,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val PAD_PRO_E110 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KENSHI, code=Pad_Pro_E111, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Pad_Pro_E111,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val PAD_PRO_E111 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KENSHI, code=Pad_Pro_E112, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KENSHI, code=Pad_Pro_E112,
      width=1600, height=2560, dpi=320, isGoogleDevice=false).code */
      val PAD_PRO_E112 = "spec:width=1600,height=2560,unit=px,dpi=320"

  }
