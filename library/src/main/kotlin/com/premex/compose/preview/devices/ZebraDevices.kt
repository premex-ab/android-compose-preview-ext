package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zebra device specifications for Android Compose previews.
 *
 * This extension provides Zebra device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zebra.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zebra get() = object {
    /** Zebra Customer Concierge 600 */
    val CUSTOMER_CONCIERGE_600 = "spec:width=720,height=1280,unit=px,dpi=160"

    /** Zebra Customer Concierge 6000 */
    val CUSTOMER_CONCIERGE_6000 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Zebra EC30 */
    val EC30 = "spec:width=480,height=854,unit=px,dpi=320"

    /** Zebra EC50 */
    val EC50 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra EC55 */
    val EC55 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra EM45 */
    val EM45 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Zebra ET40 */
    val ET40 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Zebra ET40 */
    val ET40_800X1280 = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Zebra ET45 */
    val ET45 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Zebra ET45 */
    val ET45_800X1280 = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Zebra ET5X */
    val ET5X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Zebra ET60 */
    val ET60 = "spec:width=1200,height=1920,unit=px,dpi=220"

    /** Zebra ET65 */
    val ET65 = "spec:width=1200,height=1920,unit=px,dpi=220"

    /** Zebra HC50 */
    val HC50 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Zebra KC50 Android™ Kiosk computers */
    val KC50_ANDROID_KIOSK_COMPUTERS = "spec:width=1080,height=1920,unit=px,dpi=220"

    /** Zebra MC20 */
    val MC20 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra MC330K */
    val MC330K = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra MC3400 */
    val MC3400 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra MC9400 */
    val MC9400 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra MC9450 */
    val MC9450 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra Pollux */
    val POLLUX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra PS20(Personal Shopper) */
    val PS20_PERSONAL_SHOPPER = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra TC15 */
    val TC15 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Zebra TC20 */
    val TC20 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra TC20KB */
    val TC20KB = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra TC21 */
    val TC21 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra TC25 */
    val TC25 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra TC27 */
    val TC27 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Zebra TC51 */
    val TC51 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra TC53 */
    val TC53 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Zebra TC53E */
    val TC53E = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Zebra TC55 */
    val TC55 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra TC56 */
    val TC56 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra TC58 */
    val TC58 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Zebra TC58E */
    val TC58E = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Zebra TC70x */
    val TC70X = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra TC73 */
    val TC73 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Zebra TC75x */
    val TC75X = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra TC75xDF */
    val TC75XDF = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra TC78 */
    val TC78 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Zebra TC8000 */
    val TC8000 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra VC80x */
    val VC80X = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Zebra WT6400 */
    val WT6400 = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Zebra Zebra Technologies ET51 */
    val ZEBRA_TECHNOLOGIES_ET51 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Zebra Zebra Technologies ET56 */
    val ZEBRA_TECHNOLOGIES_ET56 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Zebra Zebra Technologies L10 */
    val ZEBRA_TECHNOLOGIES_L10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Zebra Zebra Technologies MC2700 */
    val ZEBRA_TECHNOLOGIES_MC2700 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra Zebra Technologies MC3300ax */
    val ZEBRA_TECHNOLOGIES_MC3300AX = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra Zebra Technologies MC3300x */
    val ZEBRA_TECHNOLOGIES_MC3300X = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra Zebra Technologies MC9300 */
    val ZEBRA_TECHNOLOGIES_MC9300 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra Zebra Technologies TC26 */
    val ZEBRA_TECHNOLOGIES_TC26 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra Zebra Technologies TC52 */
    val ZEBRA_TECHNOLOGIES_TC52 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra Zebra Technologies TC52ax */
    val ZEBRA_TECHNOLOGIES_TC52AX = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Zebra Zebra Technologies TC57 */
    val ZEBRA_TECHNOLOGIES_TC57 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra Zebra Technologies TC57x */
    val ZEBRA_TECHNOLOGIES_TC57X = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Zebra Zebra Technologies TC72 */
    val ZEBRA_TECHNOLOGIES_TC72 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra Zebra Technologies TC77 */
    val ZEBRA_TECHNOLOGIES_TC77 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Zebra Zebra Technologies TC8300 */
    val ZEBRA_TECHNOLOGIES_TC8300 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Zebra Zebra Technologies VC8300 */
    val ZEBRA_TECHNOLOGIES_VC8300 = "spec:width=720,height=1280,unit=px,dpi=160"

    /** Zebra Zebra Technologies VC8300 */
    val ZEBRA_TECHNOLOGIES_VC8300_768X1024 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Zebra Zebra Technologies WT6300 */
    val ZEBRA_TECHNOLOGIES_WT6300 = "spec:width=480,height=800,unit=px,dpi=240"

}
