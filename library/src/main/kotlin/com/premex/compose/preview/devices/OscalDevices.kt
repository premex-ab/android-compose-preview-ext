package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Oscal device specifications for Android Compose previews.
 *
 * This extension provides Oscal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Oscal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Oscal get() = object {
    /** Oscal C20 */
    val C20 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Oscal C20 Pro */
    val C20_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Oscal C30 */
    val C30 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oscal C30 Pro */
    val C30_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oscal C60 */
    val C60 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oscal C70 */
    val C70 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Oscal C80 */
    val C80 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oscal ELITE 1 */
    val ELITE_1 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Oscal FLAT 1C */
    val FLAT_1C = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oscal FLAT 2 */
    val FLAT_2 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Oscal FLAT 2C */
    val FLAT_2C = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Oscal MARINE 1 */
    val MARINE_1 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Oscal MARINE 2 */
    val MARINE_2 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Oscal MODERN 8 */
    val MODERN_8 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oscal Pad 100 */
    val PAD_100 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Oscal Pad_10_EEA */
    val PAD_10_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Oscal Pad_10_NEU */
    val PAD_10_NEU = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Oscal Pad_10_RU */
    val PAD_10_RU = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Oscal Pad13_EEA */
    val PAD13_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Oscal Pad13_RU */
    val PAD13_RU = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Oscal Pad 15 */
    val PAD_15 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Oscal Pad 16 */
    val PAD_16 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Oscal Pad 18 */
    val PAD_18 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Oscal Pad 5 */
    val PAD_5 = "spec:width=800,height=1340,unit=px,dpi=213"

    /** Oscal Pad_50_Kids_EEA */
    val PAD_50_KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Oscal Pad_50_WiFi_EEA */
    val PAD_50_WIFI_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Oscal Pad 5 Kids */
    val PAD_5_KIDS = "spec:width=800,height=1340,unit=px,dpi=213"

    /** Oscal Pad60_EEA */
    val PAD60_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Oscal Pad 60 Kids */
    val PAD_60_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Oscal Pad60_NEU */
    val PAD60_NEU = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Oscal Pad 7 */
    val PAD_7 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Oscal Pad 70 */
    val PAD_70 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Oscal Pad 70 WiFi */
    val PAD_70_WIFI = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Oscal Pad 80 WiFi */
    val PAD_80_WIFI = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Oscal Pad 9 */
    val PAD_9 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Oscal Pad 90 */
    val PAD_90 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Oscal PILOT 1 */
    val PILOT_1 = "spec:width=720,height=1604,unit=px,dpi=320"

    /** Oscal S60 */
    val S60 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oscal S60Pro */
    val S60PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oscal S70 */
    val S70 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Oscal S70 Pro */
    val S70_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Oscal S80 */
    val S80 = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Oscal Spider8_EEA */
    val SPIDER8_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Oscal Tiger 10 */
    val TIGER_10 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Oscal Tiger 12 */
    val TIGER_12 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Oscal TIGER 13 */
    val TIGER_13 = "spec:width=720,height=1604,unit=px,dpi=320"

}
