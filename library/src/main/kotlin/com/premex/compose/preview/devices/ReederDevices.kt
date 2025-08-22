package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Reeder device specifications for Android Compose previews.
 *
 * This extension provides Reeder device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Reeder.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Reeder get() = object {
    /** Reeder A8i Q2 */
    val A8I_Q2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Reeder M10_Blue_Max */
    val M10_BLUE_MAX = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Reeder M10_Pro_LTE */
    val M10_PRO_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Reeder M10S  */
    val M10S = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Reeder M10SPlus */
    val M10SPLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Reeder M11_Pro_Max */
    val M11_PRO_MAX = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Reeder M7Go_2019 */
    val M7GO_2019 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Reeder M7 Plus */
    val M7_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Reeder M7S */
    val M7S = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Reeder M8 Go */
    val M8_GO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Reeder M8Go2020 */
    val M8GO2020 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Reeder M8S */
    val M8S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Reeder P10 */
    val P10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Reeder P10S */
    val P10S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Reeder P13 */
    val P13 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Reeder P13 Blue */
    val P13_BLUE = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Reeder P13_Blue_2021 */
    val P13_BLUE_2021 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Reeder P13_Blue_2022 */
    val P13_BLUE_2022 = "spec:width=540,height=1200,unit=px,dpi=240"

    /** Reeder P13 Blue 2022 */
    val P13_BLUE_2022_720X1520 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Reeder P13 Blue Maks */
    val P13_BLUE_MAKS = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Reeder P13 Blue Max */
    val P13_BLUE_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Reeder P13 Blue Max 128 GB */
    val P13_BLUE_MAX_128_GB = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder P13 Blue Max 128 GB 2022 */
    val P13_BLUE_MAX_128_GB_2022 = "spec:width=540,height=1200,unit=px,dpi=240"

    /** Reeder P13_Blue_MaxL_2021 */
    val P13_BLUE_MAXL_2021 = "spec:width=720,height=1520,unit=px,dpi=300"

    /** Reeder P13 Blue MaxL 2022s */
    val P13_BLUE_MAXL_2022S = "spec:width=720,height=1520,unit=px,dpi=300"

    /** Reeder P13 Blue Max Lite */
    val P13_BLUE_MAX_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Reeder P13 Blue  Max Lite 32GB */
    val P13_BLUE_MAX_LITE_32GB = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Reeder P13 Blue Max Pro */
    val P13_BLUE_MAX_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder P13 Blue Max Pro 2021 */
    val P13_BLUE_MAX_PRO_2021 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder P13 Blue Max Pro 256 GB */
    val P13_BLUE_MAX_PRO_256_GB = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder P13 Blue Plus */
    val P13_BLUE_PLUS = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Reeder P13_Blue_Plus_2022 */
    val P13_BLUE_PLUS_2022 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder P13_Blue_Pro_2022 */
    val P13_BLUE_PRO_2022 = "spec:width=540,height=1200,unit=px,dpi=240"

    /** Reeder P13 Blue Pro Lite */
    val P13_BLUE_PRO_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder P13 Max Blue */
    val P13_MAX_BLUE = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Reeder reeder M10 Plus */
    val REEDER_M10_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Reeder reeder M7 */
    val REEDER_M7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Reeder reeder M8 Plus */
    val REEDER_M8_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Reeder S19 Max */
    val S19_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder S19_Max_2_128GB */
    val S19_MAX_2_128GB = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder S19 Max 32GB */
    val S19_MAX_32GB = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder S19 Max 64GB */
    val S19_MAX_64GB = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder S19 MaxL 128GB */
    val S19_MAXL_128GB = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder S19 Max Pro */
    val S19_MAX_PRO = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Reeder S19 Max Pro S */
    val S19_MAX_PRO_S = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder S19_Max_Pro_S_108_MP_N */
    val S19_MAX_PRO_S_108_MP_N = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Reeder S19 Max Pro S Edge */
    val S19_MAX_PRO_S_EDGE = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Reeder S19 Max Pro S Zoom */
    val S19_MAX_PRO_S_ZOOM = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Reeder S23 Pro Max */
    val S23_PRO_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder S23 Pro Max 256GB */
    val S23_PRO_MAX_256GB = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Reeder S71 */
    val S71 = "spec:width=1080,height=2460,unit=px,dpi=400"

    /** Reeder S919 */
    val S919 = "spec:width=1200,height=2664,unit=px,dpi=480"

    /** Reeder T8 */
    val T8 = "spec:width=800,height=1280,unit=px,dpi=203"

    /** Reeder Turkcell_T_Tablet */
    val TURKCELL_T_TABLET = "spec:width=800,height=1280,unit=px,dpi=213"

}
