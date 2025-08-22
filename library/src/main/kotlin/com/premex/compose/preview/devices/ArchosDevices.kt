package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Archos device specifications for Android Compose previews.
 *
 * This extension provides Archos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Archos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Archos get() = object {
    /** Archos 101b Copper */
    val _101B_COPPER = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos 101b Oxygen */
    val _101B_OXYGEN = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Archos 101b Xenon */
    val _101B_XENON = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos 101c Copper */
    val _101C_COPPER = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos 101c Neon */
    val _101C_NEON = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos 101 Copper */
    val _101_COPPER = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos 101c Platinum */
    val _101C_PLATINUM = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos 101D Neon */
    val _101D_NEON = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos 101e neon */
    val _101E_NEON = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos 101 Magnus */
    val _101_MAGNUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos 101 Neon */
    val _101_NEON = "spec:width=600,height=1024,unit=px,dpi=120"

    /** Archos 101 Xenon */
    val _101_XENON = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos 101 Xenon Lite */
    val _101_XENON_LITE = "spec:width=600,height=1024,unit=px,dpi=120"

    /** Archos 101XS2 */
    val _101XS2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos 133 Oxygen */
    val _133_OXYGEN = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Archos 40 Neon */
    val _40_NEON = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Archos 45d Platinum */
    val _45D_PLATINUM = "spec:width=480,height=854,unit=px,dpi=240"

    /** Archos 50B Cobalt */
    val _50B_COBALT = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Archos 50 Cobalt */
    val _50_COBALT = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Archos 50e Helium */
    val _50E_HELIUM = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Archos 50e Neon */
    val _50E_NEON = "spec:width=480,height=854,unit=px,dpi=240"

    /** Archos 50F Neon */
    val _50F_NEON = "spec:width=480,height=854,unit=px,dpi=213"

    /** Archos 50 Platinum 4G */
    val _50_PLATINUM_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Archos 50 Power */
    val _50_POWER = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Archos 50 Saphir */
    val _50_SAPHIR = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Archos 50 Titanium 4G */
    val _50_TITANIUM_4G = "spec:width=480,height=854,unit=px,dpi=213"

    /** Archos 55B Cobalt */
    val _55B_COBALT = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Archos 55b Platinum */
    val _55B_PLATINUM = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Archos 55 Cobalt Plus */
    val _55_COBALT_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Archos 55 Helium */
    val _55_HELIUM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Archos 55 platinum */
    val _55_PLATINUM = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Archos 60 Platinum */
    val _60_PLATINUM = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Archos 70c Neon */
    val _70C_NEON = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos 70c Xenon */
    val _70C_XENON = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos 70 Oxygen */
    val _70_OXYGEN = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Archos 70 platinum */
    val _70_PLATINUM = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos 70 Xenon */
    val _70_XENON = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos 70 Xenon Color */
    val _70_XENON_COLOR = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos 80 Oxygen */
    val _80_OXYGEN = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Archos 9.4'' FFF */
    val _9_4_FFF = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos 97c Platinum */
    val _97C_PLATINUM = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Archos AC101XPro4G */
    val AC101XPRO4G = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Archos act101hd */
    val ACT101HD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos act101hd3 */
    val ACT101HD3 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos act101hdp */
    val ACT101HDP = "spec:width=800,height=1280,unit=px,dpi=186"

    /** Archos act101hdwf */
    val ACT101HDWF = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Archos ACT101WF */
    val ACT101WF = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos alba 10 */
    val ALBA_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Alba 4 */
    val ALBA_4 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Archos ALBA4 */
    val ALBA4 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Archos Alba 7'' */
    val ALBA_7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos Archos */
    val ARCHOS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Archos Archos */
    val ARCHOS_600X1024 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos Archos */
    val ARCHOS_640X1352 = "spec:width=640,height=1352,unit=px,dpi=240"

    /** Archos Archos */
    val ARCHOS_800X1280 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Archos */
    val ARCHOS_800X1280_1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Archos Archos 101b Oxygen */
    val ARCHOS_101B_OXYGEN = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Archos Archos 101b Xenon */
    val ARCHOS_101B_XENON = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Archos 101c Xenon */
    val ARCHOS_101C_XENON = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Archos 101 Oxygen 4G */
    val ARCHOS_101_OXYGEN_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Archos 101 Platinum 3G */
    val ARCHOS_101_PLATINUM_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Archos 116 Neon */
    val ARCHOS_116_NEON = "spec:width=768,height=1368,unit=px,dpi=160"

    /** Archos Archos 156 Oxygen */
    val ARCHOS_156_OXYGEN = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Archos Archos 97c Platinum */
    val ARCHOS_97C_PLATINUM = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Archos Archos Acces 101 3G */
    val ARCHOS_ACCES_101_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos Archos Access 101 3G */
    val ARCHOS_ACCESS_101_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos Archos Access 101 3G V3 */
    val ARCHOS_ACCESS_101_3G_V3 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos Archos Access 101 Wifi v2 */
    val ARCHOS_ACCESS_101_WIFI_V2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos Archos Access 45 4G */
    val ARCHOS_ACCESS_45_4G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Archos Archos Access 50 3G */
    val ARCHOS_ACCESS_50_3G = "spec:width=480,height=854,unit=px,dpi=213"

    /** Archos Archos Access 50 4G */
    val ARCHOS_ACCESS_50_4G = "spec:width=480,height=854,unit=px,dpi=213"

    /** Archos Archos Access 50S 4G */
    val ARCHOS_ACCESS_50S_4G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Archos Archos Access 55 3G */
    val ARCHOS_ACCESS_55_3G = "spec:width=540,height=960,unit=px,dpi=213"

    /** Archos Archos Access 57 4G */
    val ARCHOS_ACCESS_57_4G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Archos Archos Access 70 3G */
    val ARCHOS_ACCESS_70_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos Archos Access 70 Wifi */
    val ARCHOS_ACCESS_70_WIFI = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Archos Archos Core 101 3G */
    val ARCHOS_CORE_101_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Archos Core 101 3G V4 */
    val ARCHOS_CORE_101_3G_V4 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Archos Core 101 4G */
    val ARCHOS_CORE_101_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Archos Core 50 4G */
    val ARCHOS_CORE_50_4G = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Archos Archos Core 55S Ultra */
    val ARCHOS_CORE_55S_ULTRA = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Archos Archos Core 57S */
    val ARCHOS_CORE_57S = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Archos Archos Core 60S */
    val ARCHOS_CORE_60S = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Archos Archos Core 62S */
    val ARCHOS_CORE_62S = "spec:width=480,height=996,unit=px,dpi=240"

    /** Archos Archos Core 70 3G */
    val ARCHOS_CORE_70_3G = "spec:width=720,height=1280,unit=px,dpi=213"

    /** Archos Archos Core 70 3G */
    val ARCHOS_CORE_70_3G_800X1280 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Archos Hello 5 */
    val ARCHOS_HELLO_5 = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Archos Archos Hello 7 */
    val ARCHOS_HELLO_7 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Archos Archos Oxygen 101S */
    val ARCHOS_OXYGEN_101S = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Archos Archos Oxygen 101S Ardoiz */
    val ARCHOS_OXYGEN_101S_ARDOIZ = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Archos Archos Oxygen 57 */
    val ARCHOS_OXYGEN_57 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Archos Archos Oxygen 63 */
    val ARCHOS_OXYGEN_63 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Archos Archos Saphir 50X */
    val ARCHOS_SAPHIR_50X = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Archos Archos Sense 101X */
    val ARCHOS_SENSE_101X = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Archos Sense 50 DC */
    val ARCHOS_SENSE_50_DC = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Archos Archos Sense 50X */
    val ARCHOS_SENSE_50X = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Archos Archos Sense 55 DC */
    val ARCHOS_SENSE_55_DC = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Archos Archos Sense 55 S */
    val ARCHOS_SENSE_55_S = "spec:width=1080,height=1920,unit=px,dpi=400"

    /** Archos ARCHOS T101 4G  */
    val ARCHOS_T101_4G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Archos ARCHOS T101HD 4G */
    val ARCHOS_T101HD_4G = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Archos Archos T101X 4G */
    val ARCHOS_T101X_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Archos T 80 W */
    val ARCHOS_T_80_W = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Archos ARCHOS T96 3G_EEA */
    val ARCHOS_T96_3G_EEA = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Archos ARCHOS T96 WIFI_EEA */
    val ARCHOS_T96_WIFI_EEA = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Archos AT101FHD2WF_EEA */
    val AT101FHD2WF_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Archos AWACT80HDWF_EEA */
    val AWACT80HDWF_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Bush 10'' */
    val BUSH_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Bush 10.0 MyTablet */
    val BUSH_10_0_MYTABLET = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Bush 5 4G */
    val BUSH_5_4G = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Archos Diamond Plus */
    val DIAMOND_PLUS = "spec:width=1080,height=1920,unit=px,dpi=400"

    /** Archos Diamond S */
    val DIAMOND_S = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Archos Kodak Tab 10 */
    val KODAK_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos Smart Home Tablet */
    val SMART_HOME_TABLET = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Archos SPAC101SOXUL_EEA */
    val SPAC101SOXUL_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Archos SPACT101FHD4G */
    val SPACT101FHD4G = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Archos SPACT101HD24G_EEA */
    val SPACT101HD24G_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Archos SPACT105FHD4G_EEA */
    val SPACT105FHD4G_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Archos SPACT105FHDWFUL_EEA */
    val SPACT105FHDWFUL_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Archos SPACT110FHD4GULTRA_EEA */
    val SPACT110FHD4GULTRA_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Archos SPAT101FHDW_EEA */
    val SPAT101FHDW_EEA = "spec:width=1200,height=1920,unit=px,dpi=300"

    /** Archos SPAZA101SOXUL_EEA */
    val SPAZA101SOXUL_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Archos X18_Ultra */
    val X18_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Archos X67 5G */
    val X67_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

}
