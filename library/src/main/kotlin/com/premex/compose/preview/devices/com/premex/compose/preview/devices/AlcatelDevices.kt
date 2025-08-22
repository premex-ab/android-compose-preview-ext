package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Alcatel device specifications for Android Compose previews.
 *
 * This extension provides Alcatel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alcatel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alcatel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Alcatel, code=Apollo_8_4G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Apollo_8_4G,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val APOLLO_8_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Alcatel, code=Apollo_8_4G_TMO, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Apollo_8_4G_TMO,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val APOLLO_8_4G_TMO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Alcatel, code=Aquaman_10_4G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Aquaman_10_4G,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val AQUAMAN_10_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Alcatel, code=Aquaman_10_Kids_WIFI, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel,
      code=Aquaman_10_Kids_WIFI, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val AQUAMAN_10_KIDS_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Alcatel, code=Aquaman_10_Smart_WIFI, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel,
      code=Aquaman_10_Smart_WIFI, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val AQUAMAN_10_SMART_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Alcatel, code=Aquaman_10_WIFI, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Aquaman_10_WIFI,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val AQUAMAN_10_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Alcatel, code=Aster, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Aster, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ASTER = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Aster_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Aster_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ASTER_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Corolla, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Corolla, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val COROLLA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Cruze, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Cruze, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val CRUZE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Cruze_Lite, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Cruze_Lite,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val CRUZE_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Cruze_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Cruze_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val CRUZE_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Dahlia, width=576, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Dahlia, width=576,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val DAHLIA = "spec:width=576,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Alcatel, code=DahliaPro, width=576, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=DahliaPro, width=576,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val DAHLIAPRO = "spec:width=576,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Alcatel, code=Goldfinch_NP_Pro, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Goldfinch_NP_Pro,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val GOLDFINCH_NP_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Alcatel, code=HONG_KONG, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=HONG_KONG, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HONG_KONG = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Hong_Kong_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Hong_Kong_Pro,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HONG_KONG_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Hulk_7_GL_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Hulk_7_GL_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val HULK_7_GL_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Alcatel, code=Hulk_7_KIDS_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Hulk_7_KIDS_WIFI,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val HULK_7_KIDS_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Alcatel, code=Jakarta, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Jakarta, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val JAKARTA = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Jakarta_Lite, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Jakarta_Lite,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val JAKARTA_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Jakarta_Mini, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Jakarta_Mini,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val JAKARTA_MINI = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=King_Kong_7_4G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=King_Kong_7_4G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val KING_KONG_7_4G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Alcatel, code=Kona, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Kona, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val KONA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Macau, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Macau, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MACAU = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Alcatel, code=Milan, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Milan, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MILAN = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Phoenix_7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Phoenix_7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PHOENIX_7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Alcatel, code=Phoenix_7_Kids, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Phoenix_7_Kids,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PHOENIX_7_KIDS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Alcatel, code=Seoul, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Seoul, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SEOUL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Tokyo, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Tokyo, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val TOKYO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=TokyoPro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=TokyoPro, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val TOKYOPRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Tokyo_CAN, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Tokyo_CAN, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val TOKYO_CAN = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Tokyo_GC, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Tokyo_GC, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val TOKYO_GC = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=Tokyo_Lite, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Tokyo_Lite,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val TOKYO_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=U3A_10_WIFI_P, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=U3A_10_WIFI_P,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val U3A_10_WIFI_P = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Alcatel, code=U3A_7_3G_Refresh, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=U3A_7_3G_Refresh,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val U3A_7_3G_REFRESH = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Alcatel, code=U3A_7_WIFI_Refresh, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=U3A_7_WIFI_Refresh,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val U3A_7_WIFI_REFRESH = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Alcatel, code=Wright_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=Wright_Pro,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val WRIGHT_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alcatel, code=5006, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alcatel, code=5006, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val _5006 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
