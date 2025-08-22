package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ihunt device specifications for Android Compose previews.
 *
 * This extension provides Ihunt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ihunt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ihunt get() = object {
    /** Ihunt AlienXLite2020 */
    val ALIENXLITE2020 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Ihunt Alien_X_Pro_2021 */
    val ALIEN_X_PRO_2021 = "spec:width=720,height=1520,unit=px,dpi=300"

    /** Ihunt Cyber DOG 4G */
    val CYBER_DOG_4G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ihunt Cyber_Shark_EEA */
    val CYBER_SHARK_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ihunt iHunt Cyber Wolf 5G */
    val IHUNT_CYBER_WOLF_5G = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Ihunt iHunt Fit Runner */
    val IHUNT_FIT_RUNNER = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ihunt iHunt_Like_12_EEA */
    val IHUNT_LIKE_12_EEA = "spec:width=480,height=960,unit=px,dpi=213"

    /** Ihunt iHuntLike12PRO */
    val IHUNTLIKE12PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ihunt iHunt_Note_Ultra */
    val IHUNT_NOTE_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ihunt iHunt_P15000_EEA */
    val IHUNT_P15000_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ihunt iHuntS22PLUS */
    val IHUNTS22PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Ihunt iHunt S22  ULTRA */
    val IHUNT_S22_ULTRA = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Ihunt iHunt_S23_PLUS_EEA */
    val IHUNT_S23_PLUS_EEA = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Ihunt iHunt_S23_ULTRA */
    val IHUNT_S23_ULTRA = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Ihunt iHunt S24 PLUS */
    val IHUNT_S24_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ihunt iHunt S24 ULTRA */
    val IHUNT_S24_ULTRA = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Ihunt iHunt_S24_Xtreme_EEA */
    val IHUNT_S24_XTREME_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Ihunt iHunt_S25_ULTRA */
    val IHUNT_S25_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ihunt iHunt S60 Discovery Pro 2021 */
    val IHUNT_S60_DISCOVERY_PRO_2021 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ihunt iHunt Tablet PC 11 Ultra */
    val IHUNT_TABLET_PC_11_ULTRA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Ihunt iHunt Titan P10000 Pro */
    val IHUNT_TITAN_P10000_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Ihunt  Like 11 Panda Pro 2022 */
    val LIKE_11_PANDA_PRO_2022 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Ihunt Like 8 */
    val LIKE_8 = "spec:width=442,height=960,unit=px,dpi=213"

    /** Ihunt Like_Hi10_2021 */
    val LIKE_HI10_2021 = "spec:width=442,height=960,unit=px,dpi=240"

    /** Ihunt Like_Hi5 */
    val LIKE_HI5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ihunt P11000 Pro */
    val P11000_PRO = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Ihunt P22000 Ultra */
    val P22000_ULTRA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Ihunt P25000 Pro */
    val P25000_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Ihunt P32000_Ultra_EEA */
    val P32000_ULTRA_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Ihunt P8000_Ultra_EEA */
    val P8000_ULTRA_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ihunt S10_Tank_2019 */
    val S10_TANK_2019 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Ihunt S10 Tank 2020 */
    val S10_TANK_2020 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Ihunt S10 Tank PRO 2020 */
    val S10_TANK_PRO_2020 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ihunt S21_Plus_2021_EEA */
    val S21_PLUS_2021_EEA = "spec:width=480,height=1014,unit=px,dpi=213"

    /** Ihunt S21_Ultra_4G_2021_EEA */
    val S21_ULTRA_4G_2021_EEA = "spec:width=480,height=1014,unit=px,dpi=213"

    /** Ihunt S30 ULTRA APEX 2021 */
    val S30_ULTRA_APEX_2021 = "spec:width=1080,height=2310,unit=px,dpi=480"

    /** Ihunt S60_Discovery_2019 */
    val S60_DISCOVERY_2019 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ihunt S60 Discovery Plus */
    val S60_DISCOVERY_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ihunt Strong Tablet P15000 Pro */
    val STRONG_TABLET_P15000_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ihunt Strong Tablet P15000 Ultra */
    val STRONG_TABLET_P15000_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Ihunt Tablet PC 10 PRO */
    val TABLET_PC_10_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Ihunt Tablet_PC_12_Ultra */
    val TABLET_PC_12_ULTRA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Ihunt Tablet_X_EEA */
    val TABLET_X_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Ihunt TITAN P11000 PRO */
    val TITAN_P11000_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Ihunt TITAN P15000 PRO 5G */
    val TITAN_P15000_PRO_5G = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ihunt Titan_P4000_Pro_2021_EEA */
    val TITAN_P4000_PRO_2021_EEA = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Ihunt TitanP6000 */
    val TITANP6000 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ihunt Titan_P6000_PRO  */
    val TITAN_P6000_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ihunt Titan P8000 PRO 2021 */
    val TITAN_P8000_PRO_2021 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ihunt Titan_X_EEA */
    val TITAN_X_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

}
