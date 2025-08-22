package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Blackview device specifications for Android Compose previews.
 *
 * This extension provides Blackview device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blackview.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blackview: Any
  get() = object {
      /** DeviceSpec(manufacturer=Blackview, code=A10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A100, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A100, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val A100 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=A20, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A20, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A20 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=A200Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A200Pro,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val A200PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=A20Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A20Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A20PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A30, width=540, height=1132, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A30, width=540,
      height=1132, dpi=240, isGoogleDevice=false).code */
      val A30 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=A50, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A50, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A50 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A52, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A52, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A52 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A52Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A52Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A52PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A53, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A53, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A53 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A53_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A53_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A53_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A55, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A55, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A55 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A55_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A55_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A55_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A60, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A60, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val A60 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=A60Plus, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A60Plus, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val A60PLUS = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=A60Pro, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A60Pro, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val A60PRO = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=A60_2G, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A60_2G, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val A60_2G = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=A7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A7, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A70, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A70, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A70 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A70_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A70_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A70_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A7Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A7Pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A7PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A80, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A80, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val A80 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A80Plus, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A80Plus, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A80PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A80Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A80Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A80PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A80S, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A80S, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val A80S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A85, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A85, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val A85 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A90, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A90, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A90 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A95, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A95, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A95 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=A96, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A96, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val A96 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=A9_Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=A9_Pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A9_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=Active6, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Active6, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ACTIVE6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Active6_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Active6_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ACTIVE6_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Active6_RU, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Active6_RU,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ACTIVE6_RU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Active8, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Active8,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val ACTIVE8 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Active8Pro, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Active8Pro,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val ACTIVE8PRO = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Active_10_Pro, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Active_10_Pro,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val ACTIVE_10_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=BL5000, width=1080, height=2300, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BL5000, width=1080,
      height=2300, dpi=480, isGoogleDevice=false).code */
      val BL5000 = "spec:width=1080,height=2300,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BL6000Pro, width=1080, height=2300, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BL6000Pro,
      width=1080, height=2300, dpi=480, isGoogleDevice=false).code */
      val BL6000PRO = "spec:width=1080,height=2300,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BL8000, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BL8000, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val BL8000 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BL8800, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BL8800, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val BL8800 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BL8800Pro, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BL8800Pro,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val BL8800PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BL9000, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BL9000, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val BL9000 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BL9000_Pro, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BL9000_Pro,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val BL9000_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=Blackview, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Blackview,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BLACKVIEW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV4000, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV4000, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BV4000 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV4000Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV4000Pro,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BV4000PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV4800, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV4800, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val BV4800 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV4800Pro, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV4800Pro,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val BV4800PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV4800_SE, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV4800_SE,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val BV4800_SE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV4900, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV4900, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BV4900 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV4900Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV4900Pro,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val BV4900PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV4900s, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV4900s, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BV4900S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5100, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5100, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BV5100 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5100Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5100Pro,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val BV5100PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5200, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5200, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val BV5200 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5200_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5200_Pro,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val BV5200_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5300, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5300, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val BV5300 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5300_Plus, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5300_Plus,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val BV5300_PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5300_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5300_Pro,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val BV5300_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5500, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5500, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BV5500 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5500Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5500Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val BV5500PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5500Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5500Pro,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val BV5500PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5500S, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5500S, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BV5500S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5800, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5800, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BV5800 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5800Pro_RU, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5800Pro_RU,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val BV5800PRO_RU = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5800_PRO, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5800_PRO,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val BV5800_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5800_RU, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5800_RU,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val BV5800_RU = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV5900, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV5900, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val BV5900 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV6000S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6000S, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BV6000S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV6000S_RU, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6000S_RU,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BV6000S_RU = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV6000_RU, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6000_RU,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BV6000_RU = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV6100, width=640, height=1352, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6100, width=640,
      height=1352, dpi=240, isGoogleDevice=false).code */
      val BV6100 = "spec:width=640,height=1352,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=BV6200, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6200, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val BV6200 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV6200Pro, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6200Pro,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val BV6200PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV6200_Plus, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6200_Plus,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val BV6200_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV6200_Pro_14, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6200_Pro_14,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val BV6200_PRO_14 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV6300, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6300, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BV6300 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV6300Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6300Pro,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val BV6300PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV6600, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6600, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BV6600 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV6600E, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6600E, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BV6600E = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV6600Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6600Pro,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val BV6600PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV6800Pro, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6800Pro,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val BV6800PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV6800Pro_RU, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6800Pro_RU,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val BV6800PRO_RU = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV6900, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV6900, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val BV6900 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV7000, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV7000, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BV7000 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV7000_Pro, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV7000_Pro,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val BV7000_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV7100, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV7100, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val BV7100 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV7200, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV7200, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val BV7200 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV7300, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV7300, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val BV7300 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV8000Pro, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV8000Pro,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val BV8000PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV8000Pro_RU, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV8000Pro_RU,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val BV8000PRO_RU = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV8100, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV8100, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val BV8100 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV8200, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV8200, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val BV8200 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV8800, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV8800, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val BV8800 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV8900, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV8900, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val BV8900 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV8900_Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV8900_Pro,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val BV8900_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9000, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9000, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BV9000 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV9000Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9000Pro,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val BV9000PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=BV9000Pro-F, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9000Pro-F,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val BV9000PRO_F = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9000Pro-RU, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9000Pro-RU,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val BV9000PRO_RU = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9000-F, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9000-F,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val BV9000_F = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9000-RU, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9000-RU,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val BV9000_RU = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9100, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9100, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val BV9100 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9200, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9200, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val BV9200 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9300, width=1080, height=2388, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9300, width=1080,
      height=2388, dpi=480, isGoogleDevice=false).code */
      val BV9300 = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9300_Pro, width=1080, height=2388, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9300_Pro,
      width=1080, height=2388, dpi=480, isGoogleDevice=false).code */
      val BV9300_PRO = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9500, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9500, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val BV9500 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9500Plus, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9500Plus,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val BV9500PLUS = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9500Pro, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9500Pro,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val BV9500PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9500-RU, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9500-RU,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val BV9500_RU = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9600, width=1080, height=2248, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9600, width=1080,
      height=2248, dpi=480, isGoogleDevice=false).code */
      val BV9600 = "spec:width=1080,height=2248,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9600E, width=1080, height=2248, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9600E,
      width=1080, height=2248, dpi=480, isGoogleDevice=false).code */
      val BV9600E = "spec:width=1080,height=2248,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9700Pro, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9700Pro,
      width=1080, height=2280, dpi=480, isGoogleDevice=false).code */
      val BV9700PRO = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9800, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9800, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val BV9800 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9800Pro, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9800Pro,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val BV9800PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9900, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9900, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val BV9900 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9900E, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9900E,
      width=1080, height=2280, dpi=480, isGoogleDevice=false).code */
      val BV9900E = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=BV9900Pro, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=BV9900Pro,
      width=1080, height=2280, dpi=480, isGoogleDevice=false).code */
      val BV9900PRO = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=COLOR_8, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=COLOR_8, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val COLOR_8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=E7s, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=E7s, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E7S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=HERO10, width=1080, height=2560, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=HERO10, width=1080,
      height=2560, dpi=480, isGoogleDevice=false).code */
      val HERO10 = "spec:width=1080,height=2560,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=MAX1, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=MAX1, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val MAX1 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=MEGA_1, width=1200, height=2000, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=MEGA_1, width=1200,
      height=2000, dpi=260, isGoogleDevice=false).code */
      val MEGA_1 = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Blackview, code=MEGA_2, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=MEGA_2, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val MEGA_2 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=MEGA_8, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=MEGA_8, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val MEGA_8 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=N6000, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=N6000, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val N6000 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=N6000_SE, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=N6000_SE,
      width=540, height=1200, dpi=240, isGoogleDevice=false).code */
      val N6000_SE = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=P10000_Pro, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=P10000_Pro,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val P10000_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=P2Lite, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=P2Lite, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P2LITE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=P6000, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=P6000, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P6000 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=Pad8_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Pad8_EEA,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val PAD8_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Pad8_ROW, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Pad8_ROW,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val PAD8_ROW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=S6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=S6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=S8, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=S8, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=Shark8, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Shark8, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val SHARK8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blackview, code=SHARK_9, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=SHARK_9, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val SHARK_9 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=Tab10WiFi, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab10WiFi,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val TAB10WIFI = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Blackview, code=Tab11SE_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab11SE_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val TAB11SE_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab11SE_NEU, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab11SE_NEU,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val TAB11SE_NEU = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab11SE_RU, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab11SE_RU,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val TAB11SE_RU = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab11WiFi_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab11WiFi_EEA,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val TAB11WIFI_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab11WiFi_NEU, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab11WiFi_NEU,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val TAB11WIFI_NEU = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab11_EA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab11_EA,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val TAB11_EA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab11_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab11_EEA,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val TAB11_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab11_NEU, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab11_NEU,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val TAB11_NEU = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab11_ROW, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab11_ROW,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val TAB11_ROW = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab11_RU, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab11_RU,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val TAB11_RU = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab12Pro_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab12Pro_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TAB12PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab12Pro_NEU, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab12Pro_NEU,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TAB12PRO_NEU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab12_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab12_EEA,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB12_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab12_NEU, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab12_NEU,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB12_NEU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab13Pro_NEU, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab13Pro_NEU,
      width=800, height=1280, dpi=210, isGoogleDevice=false).code */
      val TAB13PRO_NEU = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=Blackview, code=Tab13_Pro, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab13_Pro,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TAB13_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab15Pro_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab15Pro_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TAB15PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab15Pro_NEU, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab15Pro_NEU,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TAB15PRO_NEU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab16_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab16_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val TAB16_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab16_NEU, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab16_NEU,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val TAB16_NEU = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab16_Pro, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab16_Pro,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TAB16_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab16_RU, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab16_RU,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val TAB16_RU = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab18, width=1200, height=2000, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab18, width=1200,
      height=2000, dpi=260, isGoogleDevice=false).code */
      val TAB18 = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Blackview, code=Tab3Kids, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab3Kids,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val TAB3KIDS = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab50Kids, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab50Kids,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB50KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab50WiFi, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab50WiFi,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB50WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab5EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab5EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB5EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab5NEU, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab5NEU, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB5NEU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab60, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab60, width=800,
      height=1340, dpi=213, isGoogleDevice=false).code */
      val TAB60 = "spec:width=800,height=1340,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab60Kids, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab60Kids,
      width=800, height=1340, dpi=213, isGoogleDevice=false).code */
      val TAB60KIDS = "spec:width=800,height=1340,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab60Kids_EEA, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab60Kids_EEA,
      width=800, height=1340, dpi=213, isGoogleDevice=false).code */
      val TAB60KIDS_EEA = "spec:width=800,height=1340,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab60Kids_RU, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab60Kids_RU,
      width=800, height=1340, dpi=213, isGoogleDevice=false).code */
      val TAB60KIDS_RU = "spec:width=800,height=1340,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab6Kids_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab6Kids_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB6KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab6Kids_RU, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab6Kids_RU,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB6KIDS_RU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab6s_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab6s_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB6S_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab6s_NEU, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab6s_NEU,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB6S_NEU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab6_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab6_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB6_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab6_NEU, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab6_NEU,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB6_NEU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab70WiFi, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab70WiFi,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB70WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab7Pro_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab7Pro_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TAB7PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab7Pro_NEU, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab7Pro_NEU,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TAB7PRO_NEU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab8, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab8, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB8 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab80, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab80, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab80_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab80_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB80_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab80_RU, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab80_RU,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB80_RU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab8_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab8_EEA,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB8_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab8_NEU, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab8_NEU,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB8_NEU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab8_ROW, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab8_ROW,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB8_ROW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab8_RU, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab8_RU,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB8_RU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab8_WiFi_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab8_WiFi_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB8_WIFI_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab8_WiFi_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab8_WiFi_ROW,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB8_WIFI_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab9_NEU, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab9_NEU,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB9_NEU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab9_RU, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab9_RU,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB9_RU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_10, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB_10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_10_Pro, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_10_Pro,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB_10_PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_13, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_13, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB_13 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_15_EU, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_15_EU,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB_15_EU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_15_NEU, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_15_NEU,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB_15_NEU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_15_RU, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_15_RU,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB_15_RU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_30_Kids, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_30_Kids,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB_30_KIDS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_30_WIFI, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_30_WIFI,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB_30_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_60_Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_60_Pro,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_60_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_60_Pro_K, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_60_Pro_K,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_60_PRO_K = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_60_WiFi, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_60_WiFi,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_60_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_70_WiFi_14, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_70_WiFi_14,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_70_WIFI_14 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_7_EEA, width=800, height=1280, dpi=170,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_7_EEA,
      width=800, height=1280, dpi=170, isGoogleDevice=false).code */
      val TAB_7_EEA = "spec:width=800,height=1280,unit=px,dpi=170"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_7_NEU, width=800, height=1280, dpi=170,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_7_NEU,
      width=800, height=1280, dpi=170, isGoogleDevice=false).code */
      val TAB_7_NEU = "spec:width=800,height=1280,unit=px,dpi=170"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_7_WiFi_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_7_WiFi_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_7_WIFI_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_7_WiFi_NEU, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_7_WiFi_NEU,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_7_WIFI_NEU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_80_Kids, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_80_Kids,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_80_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_90, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_90, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_90 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_90_WiFi, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_90_WiFi,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_90_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_9_WiFi, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_9_WiFi,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TAB_9_WIFI = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_A5_Kids, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_A5_Kids,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_A5_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=Tab_A6_Kids, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=Tab_A6_Kids,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_A6_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blackview, code=WAVE6C, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=WAVE6C, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val WAVE6C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=WAVE_8, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=WAVE_8, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val WAVE_8 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blackview, code=WAVE_8C, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackview, code=WAVE_8C, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val WAVE_8C = "spec:width=720,height=1612,unit=px,dpi=320"

  }
