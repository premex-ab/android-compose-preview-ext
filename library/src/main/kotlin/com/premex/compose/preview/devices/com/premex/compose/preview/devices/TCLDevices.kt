package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TCL device specifications for Android Compose previews.
 *
 * This extension provides TCL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TCL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TCL: Any
  get() = object {
      /** DeviceSpec(manufacturer=TCL, code=A30ATMO, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=A30ATMO, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A30ATMO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=A3A, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=A3A, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A3A = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=A3A_10_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=A3A_10_4G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val A3A_10_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=A3A_8_4G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=A3A_8_4G, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val A3A_8_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=A3A_8_4G_TMO, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=A3A_8_4G_TMO, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val A3A_8_4G_TMO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=A3A_LITE, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=A3A_LITE, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A3A_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=A3A_PLUS, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=A3A_PLUS, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A3A_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=A3A_XL_3G, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=A3A_XL_3G, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A3A_XL_3G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=A3A_XL_4G, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=A3A_XL_4G, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val A3A_XL_4G = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=A5A_INFINI, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=A5A_INFINI, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A5A_INFINI = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=A5X, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=A5X, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val A5X = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=A70AXLTMO, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=A70AXLTMO, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val A70AXLTMO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Alto45, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Alto45, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ALTO45 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=ALTO45TMO, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=ALTO45TMO, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ALTO45TMO = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=alto4_8g, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=alto4_8g, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ALTO4_8G = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=alto5, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=alto5, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val ALTO5 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=alto5_premium, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=alto5_premium, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ALTO5_PREMIUM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=alto5_sporty, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=alto5_sporty, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ALTO5_SPORTY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Ant, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Ant, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ANT = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Apollo84GBoostR, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Apollo84GBoostR,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val APOLLO84GBOOSTR = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Apollo84GUSCC, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Apollo84GUSCC, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val APOLLO84GUSCC = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Apollo_8_4G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Apollo_8_4G, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val APOLLO_8_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Aquaman_10_4G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Aquaman_10_4G, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val AQUAMAN_10_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Aquaman_10_KDDI, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Aquaman_10_KDDI,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val AQUAMAN_10_KDDI = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Aquaman_10_Pro, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Aquaman_10_Pro,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val AQUAMAN_10_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Aquaman_10_Smart_WIFI, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Aquaman_10_Smart_WIFI,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val AQUAMAN_10_SMART_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Ares_11_4G, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Ares_11_4G, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ARES_11_4G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Ares_11_WIFI, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Ares_11_WIFI, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ARES_11_WIFI = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Ares_Vis_WIFI, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Ares_Vis_WIFI,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val ARES_VIS_WIFI = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Aster, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Aster, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ASTER = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Aster_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Aster_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ASTER_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Austin, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Austin, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val AUSTIN = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Austin_TF, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Austin_TF, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val AUSTIN_TF = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Austin_US, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Austin_US, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val AUSTIN_US = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Bangkok_TF, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Bangkok_TF, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BANGKOK_TF = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Bee_One, width=540, height=1092, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Bee_One, width=540,
      height=1092, dpi=240, isGoogleDevice=false).code */
      val BEE_ONE = "spec:width=540,height=1092,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Bellona_WF_GL, width=1440, height=2200, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Bellona_WF_GL,
      width=1440, height=2200, dpi=320, isGoogleDevice=false).code */
      val BELLONA_WF_GL = "spec:width=1440,height=2200,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Benz, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Benz, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val BENZ = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Beryl_TMO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Beryl_TMO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BERYL_TMO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=BeyondTV4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=BeyondTV4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BEYONDTV4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Bora_NA_OM, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Bora_NA_OM, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BORA_NA_OM = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Bora_TF, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Bora_TF, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BORA_TF = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Bora_TMO, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Bora_TMO, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BORA_TMO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Boston, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Boston, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val BOSTON = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Bremen_NA_OM, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Bremen_NA_OM, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BREMEN_NA_OM = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Bremen_TF, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Bremen_TF, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BREMEN_TF = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Buffalo, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Buffalo, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BUFFALO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Buffalo_Boost, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Buffalo_Boost, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BUFFALO_BOOST = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Buffalo_CAN, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Buffalo_CAN, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BUFFALO_CAN = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Buffalo_TMO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Buffalo_TMO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BUFFALO_TMO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=BUZZ6E, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=BUZZ6E, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BUZZ6E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=BUZZ6T4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=BUZZ6T4G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BUZZ6T4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=BUZZ6T4GCRICKET, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=BUZZ6T4GCRICKET,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BUZZ6T4GCRICKET = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=BUZZ6T4GGOPHONE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=BUZZ6T4GGOPHONE,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BUZZ6T4GGOPHONE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=BUZZ6T4GTELUS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=BUZZ6T4GTELUS, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BUZZ6T4GTELUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=BUZZ6T4GTFUMTS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=BUZZ6T4GTFUMTS,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BUZZ6T4GTFUMTS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=BUZZ6_55, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=BUZZ6_55, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BUZZ6_55 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=C05, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=C05, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val C05 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=C06, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=C06, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C06 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=Challenger_CS, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Challenger_CS,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val CHALLENGER_CS = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Challenger_TH, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Challenger_TH,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val CHALLENGER_TH = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Challenger_TMO, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Challenger_TMO,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val CHALLENGER_TMO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Civic, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Civic, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val CIVIC = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Civic_Plus, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Civic_Plus, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val CIVIC_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Civic_S, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Civic_S, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val CIVIC_S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Civic_S_Refresh, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Civic_S_Refresh,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val CIVIC_S_REFRESH = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Corolla, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Corolla, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val COROLLA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=CROSS2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=CROSS2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CROSS2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Cruze, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Cruze, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val CRUZE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Cruze_Lite, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Cruze_Lite, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val CRUZE_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Cruze_Lite_S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Cruze_Lite_S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val CRUZE_LITE_S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Cruze_Lite_TF, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Cruze_Lite_TF, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val CRUZE_LITE_TF = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Cruze_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Cruze_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val CRUZE_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Curie, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Curie, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val CURIE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Delhi_TF, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Delhi_TF, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val DELHI_TF = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Doha_TMO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Doha_TMO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DOHA_TMO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Dragonfly, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Dragonfly, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val DRAGONFLY = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Dragonfly_CAN, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Dragonfly_CAN, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val DRAGONFLY_CAN = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Dragonfly_OM, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Dragonfly_OM, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val DRAGONFLY_OM = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Dragonfly_TF, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Dragonfly_TF, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val DRAGONFLY_TF = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Dragonfly_VZW, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Dragonfly_VZW, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val DRAGONFLY_VZW = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Dubai_Plus_ATT, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Dubai_Plus_ATT,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val DUBAI_PLUS_ATT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Dubai_VZW, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Dubai_VZW, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val DUBAI_VZW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=E8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=E8, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val E8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=EasyTAB8MPCS, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=EasyTAB8MPCS, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val EASYTAB8MPCS = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=EasyTAB8TMO, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=EasyTAB8TMO, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val EASYTAB8TMO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Eclipse, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Eclipse, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ECLIPSE = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Edison, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Edison, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val EDISON = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Edison_CKT, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Edison_CKT, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val EDISON_CKT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=EDISON_TF, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=EDISON_TF, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val EDISON_TF = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=ELSA6, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=ELSA6, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ELSA6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=ELSA6P, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=ELSA6P, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ELSA6P = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=elsa6_amz, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=elsa6_amz, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ELSA6_AMZ = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=elsa6_na, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=elsa6_na, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ELSA6_NA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Encore_CAN, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Encore_CAN, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val ENCORE_CAN = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Encore_OM, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Encore_OM, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val ENCORE_OM = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Encore_Spectrum, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Encore_Spectrum,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val ENCORE_SPECTRUM = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Encore_TF, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Encore_TF, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val ENCORE_TF = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Encore_USCC, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Encore_USCC, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val ENCORE_USCC = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Encore_Visible, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Encore_Visible,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val ENCORE_VISIBLE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Encore_VZW, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Encore_VZW, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val ENCORE_VZW = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=EOS_lte, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=EOS_lte, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EOS_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Erica_NP_Pro, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Erica_NP_Pro, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val ERICA_NP_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Eternals11, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Eternals11, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val ETERNALS11 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Faraday, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Faraday, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val FARADAY = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=feijao, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=feijao, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val FEIJAO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=FERMI_ATT, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=FERMI_ATT, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val FERMI_ATT = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=FERMI_TF, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=FERMI_TF, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val FERMI_TF = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Firefly, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Firefly, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val FIREFLY = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Freyr_10_1_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Freyr_10_1_4G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val FREYR_10_1_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=Freyr_10_1_WiFi, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Freyr_10_1_WiFi,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val FREYR_10_1_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=Freyr_Pro_4G_U, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Freyr_Pro_4G_U,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val FREYR_PRO_4G_U = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=G05, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=G05, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val G05 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=G06, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=G06, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val G06 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=G07, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=G07, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val G07 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=G08, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=G08, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val G08 = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=G09, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=G09, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val G09 = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=G10, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=G10, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val G10 = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=G13, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=G13, width=1080,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val G13 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=Gaia, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Gaia, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val GAIA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Gauss, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Gauss, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val GAUSS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Goldfinch_Dish, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Goldfinch_Dish,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val GOLDFINCH_DISH = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Goldfinch_NP, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Goldfinch_NP, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val GOLDFINCH_NP = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Goldfinch_NP_Pro, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Goldfinch_NP_Pro,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val GOLDFINCH_NP_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Goldfinch_Pro_CS, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Goldfinch_Pro_CS,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val GOLDFINCH_PRO_CS = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Goldfinch_TMO, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Goldfinch_TMO,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val GOLDFINCH_TMO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=HANDYT2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=HANDYT2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HANDYT2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Hera_Vis_WIFI, width=1600, height=2400, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Hera_Vis_WIFI,
      width=1600, height=2400, dpi=320, isGoogleDevice=false).code */
      val HERA_VIS_WIFI = "spec:width=1600,height=2400,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Hero2C, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Hero2C, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HERO2C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=HONG_KONG, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=HONG_KONG, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HONG_KONG = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Hong_Kong_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Hong_Kong_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HONG_KONG_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=I1-5_4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=I1-5_4G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I1_5_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=idol3, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=idol3, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val IDOL3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=idol347, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=idol347, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IDOL347 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=idol4, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=idol4, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val IDOL4 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=idol4s, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=idol4s, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val IDOL4S = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=TCL, code=idol4s_skt, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=idol4s_skt, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val IDOL4S_SKT = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=TCL, code=IDOL5S, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=IDOL5S, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val IDOL5S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Irvine, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Irvine, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val IRVINE = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Irvine_VZW, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Irvine_VZW, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val IRVINE_VZW = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Jakarta, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Jakarta, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val JAKARTA = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Jakarta_Lite, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Jakarta_Lite, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val JAKARTA_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Jakarta_Lite_refresh, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Jakarta_Lite_refresh,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val JAKARTA_LITE_REFRESH = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Jakarta_Mini, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Jakarta_Mini, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val JAKARTA_MINI = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Jetta_ATT, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Jetta_ATT, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val JETTA_ATT = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Jetta_Dish, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Jetta_Dish, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val JETTA_DISH = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Jetta_NA_OM, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Jetta_NA_OM, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val JETTA_NA_OM = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Jetta_TF, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Jetta_TF, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val JETTA_TF = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Jetta_Visible, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Jetta_Visible, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val JETTA_VISIBLE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Jetta_VZW, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Jetta_VZW, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val JETTA_VZW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Kona, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Kona, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val KONA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Ladybird, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Ladybird, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val LADYBIRD = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Ladybird_Pro, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Ladybird_Pro, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val LADYBIRD_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Levin, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Levin, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val LEVIN = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Lion-5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Lion-5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LION_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Logan, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Logan, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val LOGAN = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Logan_FHD, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Logan_FHD, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LOGAN_FHD = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Lotus, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Lotus, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val LOTUS = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=TCL, code=Luna, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Luna, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val LUNA = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Luna_8_4G_ATT, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Luna_8_4G_ATT, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val LUNA_8_4G_ATT = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Luna_8_4G_TMO, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Luna_8_4G_TMO, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val LUNA_8_4G_TMO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Luna_8_4G_VZW, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Luna_8_4G_VZW, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val LUNA_8_4G_VZW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Macau, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Macau, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MACAU = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Miami_Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Miami_Pro, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val MIAMI_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Miata_3G, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Miata_3G, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MIATA_3G = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=MIATA_lte, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=MIATA_lte, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MIATA_LTE = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=mickey6, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=mickey6, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MICKEY6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Mickey6CC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Mickey6CC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MICKEY6CC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=mickey6t, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=mickey6t, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MICKEY6T = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Mickey6TFEVDO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Mickey6TFEVDO, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MICKEY6TFEVDO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Mickey6TTMO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Mickey6TTMO, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MICKEY6TTMO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Mickey6TVZW, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Mickey6TVZW, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MICKEY6TVZW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=MICKEY6US, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=MICKEY6US, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MICKEY6US = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Mickey6VZW, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Mickey6VZW, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MICKEY6VZW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Model_3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Model_3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MODEL_3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Morgan_4G, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Morgan_4G, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MORGAN_4G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Oakland, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Oakland, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OAKLAND = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Odin, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Odin, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ODIN = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Odin2, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Odin2, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ODIN2 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Odin5GACG, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Odin5GACG, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ODIN5GACG = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Odin_5G, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Odin_5G, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ODIN_5G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Odin_5G_TMO, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Odin_5G_TMO, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ODIN_5G_TMO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Optimus_5G_VZW, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Optimus_5G_VZW,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val OPTIMUS_5G_VZW = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Ottawa, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Ottawa, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OTTAWA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=P3-5_4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=P3-5_4G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P3_5_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Passat, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Passat, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PASSAT = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Passat_5G, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Passat_5G, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PASSAT_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Pixi2-7_4G_TMO, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi2-7_4G_TMO,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI2_7_4G_TMO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi3454GSPR, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi3454GSPR, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PIXI3454GSPR = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Pixi3554GEVDO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi3554GEVDO, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PIXI3554GEVDO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=pixi37, width=600, height=1024, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=pixi37, width=600,
      height=1024, dpi=240, isGoogleDevice=false).code */
      val PIXI37 = "spec:width=600,height=1024,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=pixi384g, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=pixi384g, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PIXI384G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=Pixi3-10_3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi3-10_3G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PIXI3_10_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=Pixi3-10_WiFi, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi3-10_WiFi, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PIXI3_10_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=PIXI3_35, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI3_35, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val PIXI3_35 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi3-35TF, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi3-35TF, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val PIXI3_35TF = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi3-4, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi3-4, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PIXI3_4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Pixi3-45, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi3-45, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PIXI3_45 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=PIXI3_45_4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI3_45_4G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PIXI3_45_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=PIXI3_4TF, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI3_4TF, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PIXI3_4TF = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=PIXI3-5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI3-5, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PIXI3_5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=PIXI3-55, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI3-55, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PIXI3_55 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Pixi3-7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi3-7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI3_7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi3-7_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi3-7_3G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI3_7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi3_7_4G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi3_7_4G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI3_7_4G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi3-7_4G_EE, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi3-7_4G_EE, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI3_7_4G_EE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi3-8_WIFI, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi3-8_WIFI, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PIXI3_8_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=Pixi445, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi445, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PIXI445 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Pixi445CAN, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi445CAN, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PIXI445CAN = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Pixi445Cricket, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi445Cricket,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val PIXI445CRICKET = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Pixi445SPR, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi445SPR, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PIXI445SPR = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Pixi445TFVZW, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi445TFVZW, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PIXI445TFVZW = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Pixi4PlusPower, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi4PlusPower,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val PIXI4PLUSPOWER = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=PIXI4-35, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI4-35, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val PIXI4_35 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi4-4, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi4-4, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PIXI4_4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=PIXI4-4C_GO, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI4-4C_GO, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PIXI4_4C_GO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=PIXI4_4TF, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI4_4TF, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PIXI4_4TF = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Pixi4-5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi4-5, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PIXI4_5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=PIXI4_55_3G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI4_55_3G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PIXI4_55_3G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=PIXI4_5_4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI4_5_4G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PIXI4_5_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Pixi4-64GMEX, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi4-64GMEX, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PIXI4_64GMEX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Pixi4-6_3G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi4-6_3G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PIXI4_6_3G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Pixi4-6_4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi4-6_4G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PIXI4_6_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Pixi4-6_4G_CKT, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi4-6_4G_CKT,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val PIXI4_6_4G_CKT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Pixi4-7_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi4-7_3G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI4_7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=PIXI4-7_4G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI4-7_4G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI4_7_4G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi4-7_4G_Bell, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi4-7_4G_Bell,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI4_7_4G_BELL = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi4-7_4G_Rogers, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi4-7_4G_Rogers,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI4_7_4G_ROGERS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi4-7_4G_Telus, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi4-7_4G_Telus,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI4_7_4G_TELUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi4-7_4G_TMO, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi4-7_4G_TMO,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI4_7_4G_TMO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi4-7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi4-7_WIFI, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI4_7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pixi5-10_4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi5-10_4G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PIXI5_10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=PIXI5-6_4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI5-6_4G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PIXI5_6_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Pixi5-7_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pixi5-7_3G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI5_7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=PIXI5-8_4G_Telus, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI5-8_4G_Telus,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PIXI5_8_4G_TELUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=PIXI5-8_4G_TMO, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI5-8_4G_TMO,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PIXI5_8_4G_TMO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=PIXI7, width=540, height=960, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI7, width=540,
      height=960, dpi=160, isGoogleDevice=false).code */
      val PIXI7 = "spec:width=540,height=960,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=PIXI8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXI8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PIXI8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=PIXO7, width=540, height=960, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXO7, width=540,
      height=960, dpi=160, isGoogleDevice=false).code */
      val PIXO7 = "spec:width=540,height=960,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=PIXO8_3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PIXO8_3G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PIXO8_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=PLAY-5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PLAY-5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PLAY_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=PLAY_P1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=PLAY_P1, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PLAY_P1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=POP10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=POP10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val POP10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=Pop35, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pop35, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val POP35 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=Pop355, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pop355, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val POP355 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Pop445, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pop445, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val POP445 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=POP45, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=POP45, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val POP45 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=POP455C, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=POP455C, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val POP455C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=POP4-10_4G, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=POP4-10_4G, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val POP4_10_4G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=POP4-6_4G, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=POP4-6_4G, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val POP4_6_4G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=POP4-7_4G, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=POP4-7_4G, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val POP4_7_4G = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=POP5-6_4G, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=POP5-6_4G, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val POP5_6_4G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=POP7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=POP7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val POP7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Pop7_LTE, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Pop7_LTE, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val POP7_LTE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=POP8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=POP8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val POP8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=Rapid_CKT, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Rapid_CKT, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RAPID_CKT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Rapid_USCC, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Rapid_USCC, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RAPID_USCC = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Richland, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Richland, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val RICHLAND = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Richland_Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Richland_Pro, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val RICHLAND_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Rio, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Rio, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val RIO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=RIO_4G, width=480, height=800, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=RIO_4G, width=480,
      height=800, dpi=213, isGoogleDevice=false).code */
      val RIO_4G = "spec:width=480,height=800,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=Rio_CAN, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Rio_CAN, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val RIO_CAN = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=TCL, code=Rio_TMO, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Rio_TMO, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val RIO_TMO = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=TCL, code=Ruby_TF, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Ruby_TF, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val RUBY_TF = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Ruby_VZW, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Ruby_VZW, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val RUBY_VZW = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=ScarabLite_TMO, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=ScarabLite_TMO,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val SCARABLITE_TMO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Scarab_Lite_TF, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Scarab_Lite_TF,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val SCARAB_LITE_TF = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Scarab_Pro_NA_OM, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Scarab_Pro_NA_OM,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val SCARAB_PRO_NA_OM = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Scarab_Pro_TF, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Scarab_Pro_TF, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val SCARAB_PRO_TF = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Scarab_Pro_VZW, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Scarab_Pro_VZW,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val SCARAB_PRO_VZW = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Seattle, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Seattle, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val SEATTLE = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Seattle_VZW, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Seattle_VZW, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val SEATTLE_VZW = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Seoul, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Seoul, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SEOUL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Seoul_ATT, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Seoul_ATT, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val SEOUL_ATT = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=TCL, code=Seoul_TF, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Seoul_TF, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val SEOUL_TF = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=TCL, code=shine_lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=shine_lite, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SHINE_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=shine_plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=shine_plus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SHINE_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=SIMBA6L, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=SIMBA6L, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SIMBA6L = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=simba6_cricket, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=simba6_cricket,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val SIMBA6_CRICKET = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=simba6_global, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=simba6_global,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val SIMBA6_GLOBAL = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Sonata_BBH, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Sonata_BBH, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SONATA_BBH = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Sonata_Pro_OM, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Sonata_Pro_OM, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SONATA_PRO_OM = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Sonata_TF, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Sonata_TF, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SONATA_TF = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=SOUL35, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=SOUL35, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val SOUL35 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=SOUL45_GSM, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=SOUL45_GSM, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SOUL45_GSM = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Sunrise_CAN, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Sunrise_CAN, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val SUNRISE_CAN = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Sunrise_NA_OM, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Sunrise_NA_OM,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val SUNRISE_NA_OM = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=T1, width=1080, height=2340, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=T1, width=1080,
      height=2340, dpi=320, isGoogleDevice=false).code */
      val T1 = "spec:width=1080,height=2340,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=T1_LITE, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=T1_LITE, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val T1_LITE = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=T1_PRO, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=T1_PRO, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val T1_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=tcl, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=tcl, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCL = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=tcl_eu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=tcl_eu, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCL_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=tcl_sa, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=tcl_sa, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCL_SA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Thor_8_4G_VZW, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Thor_8_4G_VZW,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val THOR_8_4G_VZW = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Titan_Vis_Wifi, width=1440, height=2160, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Titan_Vis_Wifi,
      width=1440, height=2160, dpi=320, isGoogleDevice=false).code */
      val TITAN_VIS_WIFI = "spec:width=1440,height=2160,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Tokyo_Lite, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Tokyo_Lite, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val TOKYO_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Tokyo_TF, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Tokyo_TF, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val TOKYO_TF = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Transformer, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Transformer, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val TRANSFORMER = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Transformer2, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Transformer2, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val TRANSFORMER2 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Transformer_4G, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Transformer_4G,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val TRANSFORMER_4G = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Transformer_VZW, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Transformer_VZW,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val TRANSFORMER_VZW = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=U3, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U3, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val U3 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=U3A_10_WIFI, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U3A_10_WIFI, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val U3A_10_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=U3A_7_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U3A_7_3G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val U3A_7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=U3A_7_WIFI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U3A_7_WIFI, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val U3A_7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=U3A_7_WIFI_Refresh, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U3A_7_WIFI_Refresh,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val U3A_7_WIFI_REFRESH = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=U3A_PLUS_4G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U3A_PLUS_4G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val U3A_PLUS_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=U3_3G, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U3_3G, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val U3_3G = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=U50APLUSTMO, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U50APLUSTMO, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val U50APLUSTMO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=U50A_ATT, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U50A_ATT, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val U50A_ATT = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=U50A_PLUS_ATT, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U50A_PLUS_ATT, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val U50A_PLUS_ATT = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=U50A_PLUS_TF, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U50A_PLUS_TF, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val U50A_PLUS_TF = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=U50PLUS, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U50PLUS, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val U50PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=U5A_PLUS_3G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U5A_PLUS_3G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val U5A_PLUS_3G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=U5A_PLUS_4G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U5A_PLUS_4G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val U5A_PLUS_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=U5_3G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=U5_3G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val U5_3G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=UnionTV, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=UnionTV, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val UNIONTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TCL, code=Venice, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Venice, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VENICE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Venus_4G_GL, width=800, height=1340, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Venus_4G_GL, width=800,
      height=1340, dpi=240, isGoogleDevice=false).code */
      val VENUS_4G_GL = "spec:width=800,height=1340,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Venus_WiFi_GL, width=800, height=1340, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Venus_WiFi_GL, width=800,
      height=1340, dpi=240, isGoogleDevice=false).code */
      val VENUS_WIFI_GL = "spec:width=800,height=1340,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Vinca, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Vinca, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VINCA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=Wright, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Wright, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val WRIGHT = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=Wright_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Wright_Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val WRIGHT_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=X1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=X1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TCL, code=x1_plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=x1_plus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X1_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TCL, code=Xess, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Xess, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val XESS = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Xess-mini, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Xess-mini, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val XESS_MINI = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TCL, code=Yaris5NA, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=Yaris5NA, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val YARIS5NA = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TCL, code=7046T, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL, code=7046T, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val _7046T = "spec:width=720,height=1280,unit=px,dpi=320"

  }
