package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iHunt device specifications for Android Compose previews.
 *
 * This extension provides iHunt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IHunt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IHunt: Any
  get() = object {
      /** DeviceSpec(manufacturer=iHunt, code=AlienXLite2020, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=AlienXLite2020,
      width=600, height=1280, dpi=240, isGoogleDevice=false).code */
      val ALIENXLITE2020 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iHunt, code=Alien_X_Pro_2021, width=720, height=1520, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Alien_X_Pro_2021,
      width=720, height=1520, dpi=300, isGoogleDevice=false).code */
      val ALIEN_X_PRO_2021 = "spec:width=720,height=1520,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=iHunt, code=Cyber_DOG_4G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Cyber_DOG_4G,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val CYBER_DOG_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iHunt, code=Cyber_Shark, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Cyber_Shark, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CYBER_SHARK = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=Cyber_Wolf_5G, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Cyber_Wolf_5G,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val CYBER_WOLF_5G = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=iHunt, code=iHunt, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHunt, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val IHUNT = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=iHuntLike12PRO, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHuntLike12PRO,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val IHUNTLIKE12PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=iHuntS22PLUS, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHuntS22PLUS,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val IHUNTS22PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=iHuntS22ULTRA, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHuntS22ULTRA,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val IHUNTS22ULTRA = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=iHunt_Fit_Runner, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHunt_Fit_Runner,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val IHUNT_FIT_RUNNER = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=iHunt_Like_12, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHunt_Like_12,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val IHUNT_LIKE_12 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=iHunt, code=iHunt_Note_Ultra, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHunt_Note_Ultra,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val IHUNT_NOTE_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=iHunt_P15000, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHunt_P15000,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val IHUNT_P15000 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=iHunt_S23_PLUS_EEA, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHunt_S23_PLUS_EEA,
      width=720, height=1600, dpi=300, isGoogleDevice=false).code */
      val IHUNT_S23_PLUS_EEA = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=iHunt, code=iHunt_S23_ULTRA, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHunt_S23_ULTRA,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val IHUNT_S23_ULTRA = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=iHunt_S24_PLUS, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHunt_S24_PLUS,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val IHUNT_S24_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=iHunt_S24_ULTRA, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHunt_S24_ULTRA,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val IHUNT_S24_ULTRA = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=iHunt_S24_Xtreme, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHunt_S24_Xtreme,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val IHUNT_S24_XTREME = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=iHunt_S25_ULTRA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHunt_S25_ULTRA,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val IHUNT_S25_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=iHunt_S60, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=iHunt_S60, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val IHUNT_S60 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=Like_8, width=442, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Like_8, width=442,
      height=960, dpi=213, isGoogleDevice=false).code */
      val LIKE_8 = "spec:width=442,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=iHunt, code=Like_Hi10_2021, width=442, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Like_Hi10_2021,
      width=442, height=960, dpi=240, isGoogleDevice=false).code */
      val LIKE_HI10_2021 = "spec:width=442,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iHunt, code=Like_Hi5, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Like_Hi5, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LIKE_HI5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iHunt, code=P10000_Pro, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=P10000_Pro, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val P10000_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iHunt, code=P11000_Pro, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=P11000_Pro, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val P11000_PRO = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iHunt, code=P15000PRO_5G, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=P15000PRO_5G,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val P15000PRO_5G = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=P15000_Ultra, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=P15000_Ultra,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val P15000_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=P22000_Ultra, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=P22000_Ultra,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val P22000_ULTRA = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=iHunt, code=P25000_Pro, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=P25000_Pro, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val P25000_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=iHunt, code=P32000_Ultra, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=P32000_Ultra,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val P32000_ULTRA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=P8000_Ultra, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=P8000_Ultra, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P8000_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=S10_Tank_2019, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=S10_Tank_2019,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val S10_TANK_2019 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=S10_Tank_2020, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=S10_Tank_2020,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val S10_TANK_2020 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=S10_Tank_PRO_2020, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=S10_Tank_PRO_2020,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val S10_TANK_PRO_2020 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=S21_Plus_2021_EEA, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=S21_Plus_2021_EEA,
      width=480, height=1014, dpi=213, isGoogleDevice=false).code */
      val S21_PLUS_2021_EEA = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=iHunt, code=S21_Ultra_4G, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=S21_Ultra_4G,
      width=480, height=1014, dpi=213, isGoogleDevice=false).code */
      val S21_ULTRA_4G = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=iHunt, code=S30_ULTRA_APEX_2021, width=1080, height=2310, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=S30_ULTRA_APEX_2021,
      width=1080, height=2310, dpi=480, isGoogleDevice=false).code */
      val S30_ULTRA_APEX_2021 = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=iHunt, code=S60_Discovery_2019, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=S60_Discovery_2019,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val S60_DISCOVERY_2019 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=S60_Discovery_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=S60_Discovery_Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val S60_DISCOVERY_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=Tablet_P15000, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Tablet_P15000,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TABLET_P15000 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=iHunt, code=Tablet_PC_10_PRO_EEA, width=1200, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt,
      code=Tablet_PC_10_PRO_EEA, width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val TABLET_PC_10_PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=Tablet_PC_11_Ultra, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Tablet_PC_11_Ultra,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val TABLET_PC_11_ULTRA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=iHunt, code=Tablet_PC_12_Ultra, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Tablet_PC_12_Ultra,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TABLET_PC_12_ULTRA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iHunt, code=Tablet_X, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Tablet_X, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TABLET_X = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=TitanP6000, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=TitanP6000, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TITANP6000 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iHunt, code=TITAN_P11000_PRO, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=TITAN_P11000_PRO,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val TITAN_P11000_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=iHunt, code=Titan_P4000_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Titan_P4000_Pro,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val TITAN_P4000_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=Titan_P6000_PRO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Titan_P6000_PRO,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val TITAN_P6000_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=Titan_P8000_PRO_2021, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Titan_P8000_PRO_2021,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val TITAN_P8000_PRO_2021 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iHunt, code=Titan_X_EEA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iHunt, code=Titan_X_EEA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TITAN_X_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

  }
