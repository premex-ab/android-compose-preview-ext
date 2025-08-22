package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vertex device specifications for Android Compose previews.
 *
 * This extension provides Vertex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vertex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vertex get() = object {
    /** Vertex Baccara */
    val BACCARA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vertex BLK3D */
    val BLK3D = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vertex CS24 */
    val CS24 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vertex CS28 */
    val CS28 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vertex EF */
    val EF = "spec:width=480,height=854,unit=px,dpi=240"

    /** Vertex Impress Action */
    val IMPRESS_ACTION = "spec:width=480,height=800,unit=px,dpi=240"

    /** Vertex Impress_Aqua */
    val IMPRESS_AQUA = "spec:width=480,height=960,unit=px,dpi=240"

    /** Vertex Impress_Bear */
    val IMPRESS_BEAR = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vertex Impress_Blade */
    val IMPRESS_BLADE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Vertex Impress City */
    val IMPRESS_CITY = "spec:width=480,height=854,unit=px,dpi=240"

    /** Vertex Impress Click (3G) */
    val IMPRESS_CLICK_3G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Vertex Impress Click NFC */
    val IMPRESS_CLICK_NFC = "spec:width=480,height=960,unit=px,dpi=240"

    /** Vertex Impress Cube */
    val IMPRESS_CUBE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vertex Impress Eagle */
    val IMPRESS_EAGLE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vertex Impress Fire */
    val IMPRESS_FIRE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Vertex Impress Forest */
    val IMPRESS_FOREST = "spec:width=480,height=960,unit=px,dpi=240"

    /** Vertex Impress_Frost */
    val IMPRESS_FROST = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vertex Impress Grip */
    val IMPRESS_GRIP = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vertex Impress_Indigo */
    val IMPRESS_INDIGO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Vertex Impress Life */
    val IMPRESS_LIFE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Vertex Impress Luck */
    val IMPRESS_LUCK = "spec:width=480,height=854,unit=px,dpi=240"

    /** Vertex Impress_Luck4G_NFC */
    val IMPRESS_LUCK4G_NFC = "spec:width=540,height=960,unit=px,dpi=240"

    /** Vertex Impress Play (4G) */
    val IMPRESS_PLAY_4G = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Vertex Impress Stone */
    val IMPRESS_STONE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Vertex Impress_Sunset4G */
    val IMPRESS_SUNSET4G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Vertex Impress Tor */
    val IMPRESS_TOR = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vertex Impress Vega (4G) */
    val IMPRESS_VEGA_4G = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Vertex Impress_Vira */
    val IMPRESS_VIRA = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Vertex Impress Win */
    val IMPRESS_WIN = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vertex Impress_Wolf */
    val IMPRESS_WOLF = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vertex Impress_Zeon4G */
    val IMPRESS_ZEON4G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Vertex Lion_DC */
    val LION_DC = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vertex Luck */
    val LUCK = "spec:width=480,height=854,unit=px,dpi=240"

    /** Vertex Luck_L100_3G */
    val LUCK_L100_3G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Vertex Luck_L120_4G */
    val LUCK_L120_4G = "spec:width=540,height=960,unit=px,dpi=240"

    /** Vertex Luck_L130 */
    val LUCK_L130 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Vertex Pro_P300_4G */
    val PRO_P300_4G = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Vertex Pro_P300_4G */
    val PRO_P300_4G_720X1560 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Vertex S1 */
    val S1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Vertex TAB-X10 */
    val TAB_X10 = "spec:width=800,height=1280,unit=px,dpi=214"

    /** Vertex TAB-X8 */
    val TAB_X8 = "spec:width=800,height=1280,unit=px,dpi=214"

}
