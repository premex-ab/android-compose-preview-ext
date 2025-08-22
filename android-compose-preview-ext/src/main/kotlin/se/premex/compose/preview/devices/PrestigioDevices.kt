package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Prestigio device specifications for Android Compose previews.
 *
 * This extension provides Prestigio device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Prestigio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Prestigio: Any
  get() = object {
      /** Prestigio BW50B1L */
      val BW50B1L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio CD10A2G */
      val CD10A2G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio CD10A4L */
      val CD10A4L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio CD10A7G */
      val CD10A7G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio CD10A8L */
      val CD10A8L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio CD80A1G */
      val CD80A1G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio CD80A3L */
      val CD80A3L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio CD80A5G */
      val CD80A5G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio CD80A6L */
      val CD80A6L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio CF10A1L */
      val CF10A1L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio CF80A2G */
      val CF80A2G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio CF80A5L */
      val CF80A5L = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Prestigio DTE50B8L */
      val DTE50B8L = "spec:width=480,height=854,unit=px,dpi=240"

      /** Prestigio DW50A03G */
      val DW50A03G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio DW50B5G */
      val DW50B5G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio DW53B01G */
      val DW53B01G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio DW53B3G */
      val DW53B3G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio DW53B4G */
      val DW53B4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio DW55B02L */
      val DW55B02L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio DW55B8L */
      val DW55B8L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio EB50B1L */
      val EB50B1L = "spec:width=640,height=1280,unit=px,dpi=320"

      /** Prestigio HP10A11W */
      val HP10A11W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio HP10A12L */
      val HP10A12L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio HP10A17L */
      val HP10A17L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio HP10A4L */
      val HP10A4L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio HP10A5L */
      val HP10A5L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio HP70A10L */
      val HP70A10L = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Prestigio HP70A14W */
      val HP70A14W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Prestigio HP70A15G */
      val HP70A15G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** Prestigio HP70A1W */
      val HP70A1W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Prestigio HP70A2G */
      val HP70A2G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Prestigio HP70A3L */
      val HP70A3L = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Prestigio HP70A6L */
      val HP70A6L = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Prestigio HP70A7G */
      val HP70A7G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Prestigio HP80A16G */
      val HP80A16G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio HP80A21G */
      val HP80A21G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio HP8A6L */
      val HP8A6L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio HT50B2G */
      val HT50B2G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio IN39B3G */
      val IN39B3G = "spec:width=480,height=800,unit=px,dpi=240"

      /** Prestigio IN50B1L */
      val IN50B1L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio JU10A3G */
      val JU10A3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio JU70A1G */
      val JU70A1G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio JU80A2G */
      val JU80A2G = "spec:width=800,height=1280,unit=px,dpi=190"

      /** Prestigio KN54B1L */
      val KN54B1L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Prestigio LS10A3G */
      val LS10A3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio LS10A8L */
      val LS10A8L = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Prestigio LS70A2G */
      val LS70A2G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Prestigio LS70A5G */
      val LS70A5G = "spec:width=720,height=1280,unit=px,dpi=160"

      /** Prestigio LS70A6L */
      val LS70A6L = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Prestigio LS80A1L */
      val LS80A1L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio LS80A4L */
      val LS80A4L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio LS96A7G */
      val LS96A7G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio NS70A03W */
      val NS70A03W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Prestigio PMT3011_3G */
      val PMT3011_3G = "spec:width=600,height=1024,unit=px,dpi=132"

      /** Prestigio PMT3038_3G */
      val PMT3038_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Prestigio PMT3057_3G */
      val PMT3057_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Prestigio PMT3277_3G */
      val PMT3277_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Prestigio PMT3287_3G */
      val PMT3287_3G = "spec:width=770,height=1024,unit=px,dpi=160"

      /** Prestigio PMT3777_3G */
      val PMT3777_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio PMT5001_3G */
      val PMT5001_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio PMT5002_Wi */
      val PMT5002_WI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio PMT5008_3G */
      val PMT5008_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio PMT5287_4G */
      val PMT5287_4G = "spec:width=770,height=1024,unit=px,dpi=160"

      /** Prestigio PMT5487_3G */
      val PMT5487_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio PMT5777_3G */
      val PMT5777_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio PMT5887_3G */
      val PMT5887_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio PMT7077_3G */
      val PMT7077_3G = "spec:width=768,height=1024,unit=px,dpi=160"

      /** Prestigio PMT7177_3G */
      val PMT7177_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio PMT7287_3G */
      val PMT7287_3G = "spec:width=768,height=1024,unit=px,dpi=160"

      /** Prestigio PN10A01G */
      val PN10A01G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio PN80A03G */
      val PN80A03G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio PSP5504DUO */
      val PSP5504DUO = "spec:width=540,height=960,unit=px,dpi=240"

      /** Prestigio TC10A2L */
      val TC10A2L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio TC10A3L */
      val TC10A3L = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Prestigio TC70A1G */
      val TC70A1G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** Prestigio TE50B2G */
      val TE50B2G = "spec:width=480,height=854,unit=px,dpi=213"

      /** Prestigio TE50B4L */
      val TE50B4L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio TE52B10G */
      val TE52B10G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio TE55B9G */
      val TE55B9G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio TL47B1G */
      val TL47B1G = "spec:width=480,height=960,unit=px,dpi=240"

      /** Prestigio TL49B4L */
      val TL49B4L = "spec:width=480,height=960,unit=px,dpi=240"

      /** Prestigio TL52B5L */
      val TL52B5L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio TL55B3L */
      val TL55B3L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Prestigio TL61B8L */
      val TL61B8L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Prestigio TL80A15G */
      val TL80A15G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Prestigio UE55B1L */
      val UE55B1L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Prestigio WT10A1G */
      val WT10A1G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Prestigio WT10A2G */
      val WT10A2G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prestigio WT70A1L */
      val WT70A1L = "spec:width=600,height=1024,unit=px,dpi=160"

  }
