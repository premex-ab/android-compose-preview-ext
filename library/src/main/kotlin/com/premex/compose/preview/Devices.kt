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
     * Zebra Technologies devices.
     * Professional mobile computers and rugged devices.
     */
    object Zebra {
        /** Zebra TC26 - 5" HD display, 720x1280, 294 DPI */
        const val TC26 = "spec:width=720,height=1280,unit=px,dpi=294"
        
        /** Zebra TC27 - 5" FHD display, 1080x2160, 402 DPI */
        const val TC27 = "spec:width=1080,height=2160,unit=px,dpi=402"
        
        /** Zebra TC52 - 5" HD display, 720x1280, 294 DPI */
        const val TC52 = "spec:width=720,height=1280,unit=px,dpi=294"
        
        /** Zebra TC57 - 5" FHD display, 1080x1920, 441 DPI */
        const val TC57 = "spec:width=1080,height=1920,unit=px,dpi=441"
        
        /** Zebra TC72 - 4.7" HD display, 720x1280, 312 DPI */
        const val TC72 = "spec:width=720,height=1280,unit=px,dpi=312"
        
        /** Zebra TC77 - 4.7" FHD display, 1080x1920, 469 DPI */
        const val TC77 = "spec:width=1080,height=1920,unit=px,dpi=469"
    }

    /**
     * Samsung Galaxy devices.
     * Popular consumer and enterprise Android devices.
     */
    object Samsung {
        /** Samsung Galaxy S24 - 6.2" FHD+ display, 1080x2340, 416 DPI */
        const val GALAXY_S24 = "spec:width=1080,height=2340,unit=px,dpi=416"
        
        /** Samsung Galaxy S24+ - 6.7" FHD+ display, 1080x2340, 393 DPI */
        const val GALAXY_S24_PLUS = "spec:width=1080,height=2340,unit=px,dpi=393"
        
        /** Samsung Galaxy S24 Ultra - 6.8" QHD+ display, 1440x3120, 505 DPI */
        const val GALAXY_S24_ULTRA = "spec:width=1440,height=3120,unit=px,dpi=505"
        
        /** Samsung Galaxy Tab S9 - 11" WQXGA display, 1600x2560, 274 DPI */
        const val GALAXY_TAB_S9 = "spec:width=1600,height=2560,unit=px,dpi=274"
        
        /** Samsung Galaxy Tab S9+ - 12.4" WQXGA+ display, 1752x2800, 266 DPI */
        const val GALAXY_TAB_S9_PLUS = "spec:width=1752,height=2800,unit=px,dpi=266"
    }

    /**
     * Honeywell devices.
     * Enterprise mobility and data collection devices.
     */
    object Honeywell {
        /** Honeywell CT30 XP - 4" WVGA display, 480x800, 233 DPI */
        const val CT30_XP = "spec:width=480,height=800,unit=px,dpi=233"
        
        /** Honeywell CT40 - 5" HD display, 720x1280, 294 DPI */
        const val CT40 = "spec:width=720,height=1280,unit=px,dpi=294"
        
        /** Honeywell CT45 - 5" HD display, 720x1280, 294 DPI */
        const val CT45 = "spec:width=720,height=1280,unit=px,dpi=294"
        
        /** Honeywell CT60 - 4.7" HD display, 720x1280, 312 DPI */
        const val CT60 = "spec:width=720,height=1280,unit=px,dpi=312"
        
        /** Honeywell EDA52 - 5" HD display, 720x1280, 294 DPI */
        const val EDA52 = "spec:width=720,height=1280,unit=px,dpi=294"
    }
}