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
      /** iHunt AlienXLite2020 */
      val ALIENXLITE2020 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** iHunt Alien_X_Pro_2021 */
      val ALIEN_X_PRO_2021 = "spec:width=720,height=1520,unit=px,dpi=300"

      /** iHunt Cyber_DOG_4G */
      val CYBER_DOG_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** iHunt Cyber_Shark */
      val CYBER_SHARK = "spec:width=720,height=1440,unit=px,dpi=320"

      /** iHunt Cyber_Wolf_5G */
      val CYBER_WOLF_5G = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** iHunt iHunt */
      val IHUNT = "spec:width=720,height=1560,unit=px,dpi=320"

      /** iHunt iHuntLike12PRO */
      val IHUNTLIKE12PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** iHunt iHuntS22PLUS */
      val IHUNTS22PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** iHunt iHuntS22ULTRA */
      val IHUNTS22ULTRA = "spec:width=720,height=1560,unit=px,dpi=320"

      /** iHunt iHunt_Fit_Runner */
      val IHUNT_FIT_RUNNER = "spec:width=720,height=1440,unit=px,dpi=320"

      /** iHunt iHunt_Like_12 */
      val IHUNT_LIKE_12 = "spec:width=480,height=960,unit=px,dpi=213"

      /** iHunt iHunt_Note_Ultra */
      val IHUNT_NOTE_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iHunt iHunt_P15000 */
      val IHUNT_P15000 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iHunt iHunt_S23_PLUS_EEA */
      val IHUNT_S23_PLUS_EEA = "spec:width=720,height=1600,unit=px,dpi=300"

      /** iHunt iHunt_S23_ULTRA */
      val IHUNT_S23_ULTRA = "spec:width=720,height=1640,unit=px,dpi=320"

      /** iHunt iHunt_S24_PLUS */
      val IHUNT_S24_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iHunt iHunt_S24_ULTRA */
      val IHUNT_S24_ULTRA = "spec:width=720,height=1640,unit=px,dpi=320"

      /** iHunt iHunt_S24_Xtreme */
      val IHUNT_S24_XTREME = "spec:width=720,height=1612,unit=px,dpi=320"

      /** iHunt iHunt_S25_ULTRA */
      val IHUNT_S25_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iHunt iHunt_S60 */
      val IHUNT_S60 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** iHunt Like_8 */
      val LIKE_8 = "spec:width=442,height=960,unit=px,dpi=213"

      /** iHunt Like_Hi10_2021 */
      val LIKE_HI10_2021 = "spec:width=442,height=960,unit=px,dpi=240"

      /** iHunt Like_Hi5 */
      val LIKE_HI5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** iHunt P10000_Pro */
      val P10000_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** iHunt P11000_Pro */
      val P11000_PRO = "spec:width=720,height=1440,unit=px,dpi=280"

      /** iHunt P15000PRO_5G */
      val P15000PRO_5G = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iHunt P15000_Ultra */
      val P15000_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** iHunt P22000_Ultra */
      val P22000_ULTRA = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** iHunt P25000_Pro */
      val P25000_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** iHunt P32000_Ultra */
      val P32000_ULTRA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** iHunt P8000_Ultra */
      val P8000_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iHunt S10_Tank_2019 */
      val S10_TANK_2019 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** iHunt S10_Tank_2020 */
      val S10_TANK_2020 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** iHunt S10_Tank_PRO_2020 */
      val S10_TANK_PRO_2020 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** iHunt S21_Plus_2021_EEA */
      val S21_PLUS_2021_EEA = "spec:width=480,height=1014,unit=px,dpi=213"

      /** iHunt S21_Ultra_4G */
      val S21_ULTRA_4G = "spec:width=480,height=1014,unit=px,dpi=213"

      /** iHunt S30_ULTRA_APEX_2021 */
      val S30_ULTRA_APEX_2021 = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** iHunt S60_Discovery_2019 */
      val S60_DISCOVERY_2019 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** iHunt S60_Discovery_Plus */
      val S60_DISCOVERY_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** iHunt Tablet_P15000 */
      val TABLET_P15000 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** iHunt Tablet_PC_10_PRO_EEA */
      val TABLET_PC_10_PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** iHunt Tablet_PC_11_Ultra */
      val TABLET_PC_11_ULTRA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** iHunt Tablet_PC_12_Ultra */
      val TABLET_PC_12_ULTRA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** iHunt Tablet_X */
      val TABLET_X = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** iHunt TitanP6000 */
      val TITANP6000 = "spec:width=480,height=960,unit=px,dpi=240"

      /** iHunt TITAN_P11000_PRO */
      val TITAN_P11000_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** iHunt Titan_P4000_Pro */
      val TITAN_P4000_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** iHunt Titan_P6000_PRO */
      val TITAN_P6000_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** iHunt Titan_P8000_PRO_2021 */
      val TITAN_P8000_PRO_2021 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** iHunt Titan_X_EEA */
      val TITAN_X_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

  }
