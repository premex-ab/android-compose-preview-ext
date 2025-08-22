package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

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
      /** Blackview A10 */
      val A10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Blackview A100 */
      val A100 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Blackview A20 */
      val A20 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Blackview A200Pro */
      val A200PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Blackview A20Pro */
      val A20PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview A30 */
      val A30 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** Blackview A50 */
      val A50 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Blackview A52 */
      val A52 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Blackview A52Pro */
      val A52PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Blackview A53 */
      val A53 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Blackview A53_Pro */
      val A53_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Blackview A55 */
      val A55 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Blackview A55_Pro */
      val A55_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Blackview A60 */
      val A60 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** Blackview A60Plus */
      val A60PLUS = "spec:width=600,height=1280,unit=px,dpi=240"

      /** Blackview A60Pro */
      val A60PRO = "spec:width=600,height=1280,unit=px,dpi=240"

      /** Blackview A60_2G */
      val A60_2G = "spec:width=600,height=1280,unit=px,dpi=240"

      /** Blackview A7 */
      val A7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Blackview A70 */
      val A70 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Blackview A70_Pro */
      val A70_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Blackview A7Pro */
      val A7PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Blackview A80 */
      val A80 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Blackview A80Plus */
      val A80PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Blackview A80Pro */
      val A80PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Blackview A80S */
      val A80S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Blackview A85 */
      val A85 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Blackview A90 */
      val A90 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Blackview A95 */
      val A95 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Blackview A96 */
      val A96 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Blackview A9_Pro */
      val A9_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Blackview Active6 */
      val ACTIVE6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Active6_EEA */
      val ACTIVE6_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Active6_RU */
      val ACTIVE6_RU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Active8 */
      val ACTIVE8 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Blackview Active8Pro */
      val ACTIVE8PRO = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Blackview Active_10_Pro */
      val ACTIVE_10_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Blackview BL5000 */
      val BL5000 = "spec:width=1080,height=2300,unit=px,dpi=480"

      /** Blackview BL6000Pro */
      val BL6000PRO = "spec:width=1080,height=2300,unit=px,dpi=480"

      /** Blackview BL8000 */
      val BL8000 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Blackview BL8800 */
      val BL8800 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Blackview BL8800Pro */
      val BL8800PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Blackview BL9000 */
      val BL9000 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Blackview BL9000_Pro */
      val BL9000_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Blackview Blackview */
      val BLACKVIEW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Blackview BV4000 */
      val BV4000 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Blackview BV4000Pro */
      val BV4000PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Blackview BV4800 */
      val BV4800 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Blackview BV4800Pro */
      val BV4800PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Blackview BV4800_SE */
      val BV4800_SE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Blackview BV4900 */
      val BV4900 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV4900Pro */
      val BV4900PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV4900s */
      val BV4900S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV5100 */
      val BV5100 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV5100Pro */
      val BV5100PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV5200 */
      val BV5200 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Blackview BV5200_Pro */
      val BV5200_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Blackview BV5300 */
      val BV5300 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Blackview BV5300_Plus */
      val BV5300_PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Blackview BV5300_Pro */
      val BV5300_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Blackview BV5500 */
      val BV5500 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV5500Plus */
      val BV5500PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV5500Pro */
      val BV5500PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV5500S */
      val BV5500S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV5800 */
      val BV5800 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV5800Pro_RU */
      val BV5800PRO_RU = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV5800_PRO */
      val BV5800_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV5800_RU */
      val BV5800_RU = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV5900 */
      val BV5900 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Blackview BV6000S */
      val BV6000S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Blackview BV6000S_RU */
      val BV6000S_RU = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Blackview BV6000_RU */
      val BV6000_RU = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Blackview BV6100 */
      val BV6100 = "spec:width=640,height=1352,unit=px,dpi=240"

      /** Blackview BV6200 */
      val BV6200 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Blackview BV6200Pro */
      val BV6200PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Blackview BV6200_Plus */
      val BV6200_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Blackview BV6200_Pro_14 */
      val BV6200_PRO_14 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Blackview BV6300 */
      val BV6300 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV6300Pro */
      val BV6300PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV6600 */
      val BV6600 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV6600E */
      val BV6600E = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV6600Pro */
      val BV6600PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV6800Pro */
      val BV6800PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Blackview BV6800Pro_RU */
      val BV6800PRO_RU = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Blackview BV6900 */
      val BV6900 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** Blackview BV7000 */
      val BV7000 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Blackview BV7000_Pro */
      val BV7000_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Blackview BV7100 */
      val BV7100 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Blackview BV7200 */
      val BV7200 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Blackview BV7300 */
      val BV7300 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** Blackview BV8000Pro */
      val BV8000PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Blackview BV8000Pro_RU */
      val BV8000PRO_RU = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Blackview BV8100 */
      val BV8100 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Blackview BV8200 */
      val BV8200 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Blackview BV8800 */
      val BV8800 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Blackview BV8900 */
      val BV8900 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Blackview BV8900_Pro */
      val BV8900_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Blackview BV9000 */
      val BV9000 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV9000Pro */
      val BV9000PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview BV9000Pro-F */
      val BV9000PRO_F = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Blackview BV9000Pro-RU */
      val BV9000PRO_RU = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Blackview BV9000-F */
      val BV9000_F = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Blackview BV9000-RU */
      val BV9000_RU = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Blackview BV9100 */
      val BV9100 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Blackview BV9200 */
      val BV9200 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Blackview BV9300 */
      val BV9300 = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** Blackview BV9300_Pro */
      val BV9300_PRO = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** Blackview BV9500 */
      val BV9500 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Blackview BV9500Plus */
      val BV9500PLUS = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Blackview BV9500Pro */
      val BV9500PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Blackview BV9500-RU */
      val BV9500_RU = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Blackview BV9600 */
      val BV9600 = "spec:width=1080,height=2248,unit=px,dpi=480"

      /** Blackview BV9600E */
      val BV9600E = "spec:width=1080,height=2248,unit=px,dpi=480"

      /** Blackview BV9700Pro */
      val BV9700PRO = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** Blackview BV9800 */
      val BV9800 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Blackview BV9800Pro */
      val BV9800PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Blackview BV9900 */
      val BV9900 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** Blackview BV9900E */
      val BV9900E = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** Blackview BV9900Pro */
      val BV9900PRO = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** Blackview COLOR_8 */
      val COLOR_8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Blackview E7s */
      val E7S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Blackview HERO10 */
      val HERO10 = "spec:width=1080,height=2560,unit=px,dpi=480"

      /** Blackview MAX1 */
      val MAX1 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Blackview MEGA_1 */
      val MEGA_1 = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** Blackview MEGA_2 */
      val MEGA_2 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Blackview MEGA_8 */
      val MEGA_8 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview N6000 */
      val N6000 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** Blackview N6000_SE */
      val N6000_SE = "spec:width=540,height=1200,unit=px,dpi=240"

      /** Blackview P10000_Pro */
      val P10000_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Blackview P2Lite */
      val P2LITE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Blackview P6000 */
      val P6000 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Blackview Pad8_EEA */
      val PAD8_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Pad8_ROW */
      val PAD8_ROW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview S6 */
      val S6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview S8 */
      val S8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Blackview Shark8 */
      val SHARK8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Blackview SHARK_9 */
      val SHARK_9 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** Blackview Tab10WiFi */
      val TAB10WIFI = "spec:width=800,height=1280,unit=px,dpi=200"

      /** Blackview Tab11SE_EEA */
      val TAB11SE_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Blackview Tab11SE_NEU */
      val TAB11SE_NEU = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Blackview Tab11SE_RU */
      val TAB11SE_RU = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Blackview Tab11WiFi_EEA */
      val TAB11WIFI_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Blackview Tab11WiFi_NEU */
      val TAB11WIFI_NEU = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Blackview Tab11_EA */
      val TAB11_EA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Blackview Tab11_EEA */
      val TAB11_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Blackview Tab11_NEU */
      val TAB11_NEU = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Blackview Tab11_ROW */
      val TAB11_ROW = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Blackview Tab11_RU */
      val TAB11_RU = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Blackview Tab12Pro_EEA */
      val TAB12PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Blackview Tab12Pro_NEU */
      val TAB12PRO_NEU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Blackview Tab12_EEA */
      val TAB12_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab12_NEU */
      val TAB12_NEU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab13Pro_NEU */
      val TAB13PRO_NEU = "spec:width=800,height=1280,unit=px,dpi=210"

      /** Blackview Tab13_Pro */
      val TAB13_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Blackview Tab15Pro_EEA */
      val TAB15PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Blackview Tab15Pro_NEU */
      val TAB15PRO_NEU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Blackview Tab16_EEA */
      val TAB16_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Blackview Tab16_NEU */
      val TAB16_NEU = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Blackview Tab16_Pro */
      val TAB16_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Blackview Tab16_RU */
      val TAB16_RU = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Blackview Tab18 */
      val TAB18 = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** Blackview Tab3Kids */
      val TAB3KIDS = "spec:width=600,height=1024,unit=px,dpi=213"

      /** Blackview Tab50Kids */
      val TAB50KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab50WiFi */
      val TAB50WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab5EEA */
      val TAB5EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab5NEU */
      val TAB5NEU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab60 */
      val TAB60 = "spec:width=800,height=1340,unit=px,dpi=213"

      /** Blackview Tab60Kids */
      val TAB60KIDS = "spec:width=800,height=1340,unit=px,dpi=213"

      /** Blackview Tab60Kids_EEA */
      val TAB60KIDS_EEA = "spec:width=800,height=1340,unit=px,dpi=213"

      /** Blackview Tab60Kids_RU */
      val TAB60KIDS_RU = "spec:width=800,height=1340,unit=px,dpi=213"

      /** Blackview Tab6Kids_EEA */
      val TAB6KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab6Kids_RU */
      val TAB6KIDS_RU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab6s_EEA */
      val TAB6S_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab6s_NEU */
      val TAB6S_NEU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab6_EEA */
      val TAB6_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab6_NEU */
      val TAB6_NEU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab70WiFi */
      val TAB70WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab7Pro_EEA */
      val TAB7PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Blackview Tab7Pro_NEU */
      val TAB7PRO_NEU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Blackview Tab8 */
      val TAB8 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab80 */
      val TAB80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab80_EEA */
      val TAB80_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab80_RU */
      val TAB80_RU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab8_EEA */
      val TAB8_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab8_NEU */
      val TAB8_NEU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab8_ROW */
      val TAB8_ROW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab8_RU */
      val TAB8_RU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab8_WiFi_EEA */
      val TAB8_WIFI_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab8_WiFi_ROW */
      val TAB8_WIFI_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab9_NEU */
      val TAB9_NEU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab9_RU */
      val TAB9_RU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab_10 */
      val TAB_10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab_10_Pro */
      val TAB_10_PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab_13 */
      val TAB_13 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab_15_EU */
      val TAB_15_EU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab_15_NEU */
      val TAB_15_NEU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab_15_RU */
      val TAB_15_RU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Blackview Tab_30_Kids */
      val TAB_30_KIDS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Blackview Tab_30_WIFI */
      val TAB_30_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Blackview Tab_60_Pro */
      val TAB_60_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab_60_Pro_K */
      val TAB_60_PRO_K = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab_60_WiFi */
      val TAB_60_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab_70_WiFi_14 */
      val TAB_70_WIFI_14 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab_7_EEA */
      val TAB_7_EEA = "spec:width=800,height=1280,unit=px,dpi=170"

      /** Blackview Tab_7_NEU */
      val TAB_7_NEU = "spec:width=800,height=1280,unit=px,dpi=170"

      /** Blackview Tab_7_WiFi_EEA */
      val TAB_7_WIFI_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab_7_WiFi_NEU */
      val TAB_7_WIFI_NEU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab_80_Kids */
      val TAB_80_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab_90 */
      val TAB_90 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab_90_WiFi */
      val TAB_90_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab_9_WiFi */
      val TAB_9_WIFI = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Blackview Tab_A5_Kids */
      val TAB_A5_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview Tab_A6_Kids */
      val TAB_A6_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blackview WAVE6C */
      val WAVE6C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Blackview WAVE_8 */
      val WAVE_8 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Blackview WAVE_8C */
      val WAVE_8C = "spec:width=720,height=1612,unit=px,dpi=320"

  }
