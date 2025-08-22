package com.premex.compose.preview

/**
 * Extended device specifications for Android Compose previews.
 * 
 * This object provides device specifications that can be used with @Preview annotations
 * in Android Compose, extending the built-in device list with third-party manufacturer devices.
 * 
 * Usage:
 * ```
 * @Preview(device = Devices.PIXEL_8)
 * @Preview(device = Devices.Zebra.TC26)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
object Devices {
    const val DEFAULT = ""

    // Google Nexus Devices
    const val NEXUS_7 = "id:Nexus 7"
    const val NEXUS_7_2013 = "id:Nexus 7 2013"
    const val NEXUS_5 = "id:Nexus 5"
    const val NEXUS_6 = "id:Nexus 6"
    const val NEXUS_9 = "id:Nexus 9"
    const val NEXUS_10 = "name:Nexus 10"
    const val NEXUS_5X = "id:Nexus 5X"
    const val NEXUS_6P = "id:Nexus 6P"

    // Google Pixel Devices
    const val PIXEL_C = "id:pixel_c"
    const val PIXEL = "id:pixel"
    const val PIXEL_XL = "id:pixel_xl"
    const val PIXEL_2 = "id:pixel_2"
    const val PIXEL_2_XL = "id:pixel_2_xl"
    const val PIXEL_3 = "id:pixel_3"
    const val PIXEL_3_XL = "id:pixel_3_xl"
    const val PIXEL_3A = "id:pixel_3a"
    const val PIXEL_3A_XL = "id:pixel_3a_xl"
    const val PIXEL_4 = "id:pixel_4"
    const val PIXEL_4_XL = "id:pixel_4_xl"
    const val PIXEL_4A = "id:pixel_4a"
    const val PIXEL_5 = "id:pixel_5"
    const val PIXEL_6 = "id:pixel_6"
    const val PIXEL_6_PRO = "id:pixel_6_pro"
    const val PIXEL_6A = "id:pixel_6a"
    const val PIXEL_7 = "id:pixel_7"
    const val PIXEL_7_PRO = "id:pixel_7_pro"
    const val PIXEL_7A = "id:pixel_7a"
    const val PIXEL_8 = "id:pixel_8"
    const val PIXEL_8_PRO = "id:pixel_8_pro"
    const val PIXEL_8A = "id:pixel_8a"
    const val PIXEL_9 = "id:pixel_9"
    const val PIXEL_9_PRO = "id:pixel_9_pro"
    const val PIXEL_9_PRO_FOLD = "id:pixel_9_pro_fold"
    const val PIXEL_9_PRO_XL = "id:pixel_9_pro_xl"
    const val PIXEL_FOLD = "id:pixel_fold"
    const val PIXEL_TABLET = "id:pixel_tablet"

    // Automotive
    const val AUTOMOTIVE_1024p = "id:automotive_1024p_landscape"

    /**
     * Zebra devices.
     * Professional mobile computers and rugged devices.
     */
    object Zebra {
        /** Zebra ET40 - Device specification */
        const val ET40 = "spec:width=800,height=1280,unit=px,dpi=216"

        /** Zebra ET45 - Device specification */
        const val ET45 = "spec:width=800,height=1280,unit=px,dpi=216"

        /** Zebra MC18 - Device specification */
        const val MC18 = "spec:width=480,height=800,unit=px,dpi=233"

        /** Zebra MC33 - Device specification */
        const val MC33 = "spec:width=720,height=1280,unit=px,dpi=294"

        /** Zebra MC93 - Device specification */
        const val MC93 = "spec:width=800,height=480,unit=px,dpi=216"

        /** Zebra TC21 - Device specification */
        const val TC21 = "spec:width=720,height=1280,unit=px,dpi=294"

        /** Zebra TC26 - Device specification */
        const val TC26 = "spec:width=720,height=1280,unit=px,dpi=294"

        /** Zebra TC27 - Device specification */
        const val TC27 = "spec:width=1080,height=2160,unit=px,dpi=402"

        /** Zebra TC52 - Device specification */
        const val TC52 = "spec:width=720,height=1280,unit=px,dpi=294"

        /** Zebra TC56 - Device specification */
        const val TC56 = "spec:width=720,height=1280,unit=px,dpi=294"

        /** Zebra TC57 - Device specification */
        const val TC57 = "spec:width=1080,height=1920,unit=px,dpi=441"

        /** Zebra TC58 - Device specification */
        const val TC58 = "spec:width=1080,height=1920,unit=px,dpi=441"

        /** Zebra TC72 - Device specification */
        const val TC72 = "spec:width=720,height=1280,unit=px,dpi=312"

        /** Zebra TC75 - Device specification */
        const val TC75 = "spec:width=720,height=1280,unit=px,dpi=312"

        /** Zebra TC77 - Device specification */
        const val TC77 = "spec:width=1080,height=1920,unit=px,dpi=469"

        /** Zebra TC78 - Device specification */
        const val TC78 = "spec:width=1080,height=1920,unit=px,dpi=469"

        /** Zebra WT6000 - Device specification */
        const val WT6000 = "spec:width=480,height=272,unit=px,dpi=188"

    }

    /**
     * Samsung devices.
     * Popular consumer and enterprise Android devices.
     */
    object Samsung {
        /** Samsung GALAXY_A34 - Device specification */
        const val GALAXY_A34 = "spec:width=1080,height=2340,unit=px,dpi=390"

        /** Samsung GALAXY_A54 - Device specification */
        const val GALAXY_A54 = "spec:width=1080,height=2340,unit=px,dpi=403"

        /** Samsung GALAXY_S23 - Device specification */
        const val GALAXY_S23 = "spec:width=1080,height=2340,unit=px,dpi=425"

        /** Samsung GALAXY_S23_PLUS - Device specification */
        const val GALAXY_S23_PLUS = "spec:width=1080,height=2340,unit=px,dpi=393"

        /** Samsung GALAXY_S23_ULTRA - Device specification */
        const val GALAXY_S23_ULTRA = "spec:width=1440,height=3088,unit=px,dpi=500"

        /** Samsung GALAXY_S24 - Device specification */
        const val GALAXY_S24 = "spec:width=1080,height=2340,unit=px,dpi=416"

        /** Samsung GALAXY_S24_PLUS - Device specification */
        const val GALAXY_S24_PLUS = "spec:width=1080,height=2340,unit=px,dpi=393"

        /** Samsung GALAXY_S24_ULTRA - Device specification */
        const val GALAXY_S24_ULTRA = "spec:width=1440,height=3120,unit=px,dpi=505"

        /** Samsung GALAXY_TAB_S9 - Device specification */
        const val GALAXY_TAB_S9 = "spec:width=1600,height=2560,unit=px,dpi=274"

        /** Samsung GALAXY_TAB_S9_PLUS - Device specification */
        const val GALAXY_TAB_S9_PLUS = "spec:width=1752,height=2800,unit=px,dpi=266"

        /** Samsung GALAXY_TAB_S9_ULTRA - Device specification */
        const val GALAXY_TAB_S9_ULTRA = "spec:width=1848,height=2960,unit=px,dpi=240"

    }

    /**
     * Honeywell devices.
     * Enterprise mobility and data collection devices.
     */
    object Honeywell {
        /** Honeywell CT30_XP - Device specification */
        const val CT30_XP = "spec:width=480,height=800,unit=px,dpi=233"

        /** Honeywell CT40 - Device specification */
        const val CT40 = "spec:width=720,height=1280,unit=px,dpi=294"

        /** Honeywell CT45 - Device specification */
        const val CT45 = "spec:width=720,height=1280,unit=px,dpi=294"

        /** Honeywell CT45_XP - Device specification */
        const val CT45_XP = "spec:width=720,height=1280,unit=px,dpi=294"

        /** Honeywell CT60 - Device specification */
        const val CT60 = "spec:width=720,height=1280,unit=px,dpi=312"

        /** Honeywell CT60_XP - Device specification */
        const val CT60_XP = "spec:width=720,height=1280,unit=px,dpi=312"

        /** Honeywell EDA52 - Device specification */
        const val EDA52 = "spec:width=720,height=1280,unit=px,dpi=294"

        /** Honeywell EDA57 - Device specification */
        const val EDA57 = "spec:width=1080,height=1920,unit=px,dpi=441"

        /** Honeywell EDA70 - Device specification */
        const val EDA70 = "spec:width=800,height=1280,unit=px,dpi=216"

        /** Honeywell ScanPal_EDA60K - Device specification */
        const val ScanPal_EDA60K = "spec:width=720,height=1280,unit=px,dpi=312"

    }

    /**
     * Datalogic devices.
     * Professional data capture and industrial automation devices.
     */
    object Datalogic {
        /** Datalogic JOYA_TOUCH_A6 - Device specification */
        const val JOYA_TOUCH_A6 = "spec:width=480,height=800,unit=px,dpi=233"

        /** Datalogic MEMOR_1 - Device specification */
        const val MEMOR_1 = "spec:width=480,height=800,unit=px,dpi=233"

        /** Datalogic MEMOR_10 - Device specification */
        const val MEMOR_10 = "spec:width=720,height=1280,unit=px,dpi=294"

        /** Datalogic MEMOR_11 - Device specification */
        const val MEMOR_11 = "spec:width=1080,height=1920,unit=px,dpi=441"

        /** Datalogic MEMOR_20 - Device specification */
        const val MEMOR_20 = "spec:width=720,height=1280,unit=px,dpi=294"

        /** Datalogic MEMOR_35 - Device specification */
        const val MEMOR_35 = "spec:width=800,height=1280,unit=px,dpi=216"

        /** Datalogic SKORPIO_X5 - Device specification */
        const val SKORPIO_X5 = "spec:width=800,height=480,unit=px,dpi=216"

    }
}
