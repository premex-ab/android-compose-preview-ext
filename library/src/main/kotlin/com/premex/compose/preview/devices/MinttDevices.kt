package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mintt device specifications for Android Compose previews.
 *
 * This extension provides Mintt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mintt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mintt get() = object {
    /** Mintt Blaze 3 */
    val BLAZE_3 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Mintt CoolMintt */
    val COOLMINTT = "spec:width=480,height=960,unit=px,dpi=220"

    /** Mintt CoolMintt_Blaze_2 */
    val COOLMINTT_BLAZE_2 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Mintt COOLMINTT NIU */
    val COOLMINTT_NIU = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Mintt CoolMintt Rival */
    val COOLMINTT_RIVAL = "spec:width=480,height=1014,unit=px,dpi=220"

    /** Mintt COOLMINTT_RIVAL_3 */
    val COOLMINTT_RIVAL_3 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Mintt COOLMINTT_X7 */
    val COOLMINTT_X7 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mintt COOLMINTT_X9 */
    val COOLMINTT_X9 = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Mintt MINTT_DIGI_2 */
    val MINTT_DIGI_2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Mintt MinttM3 */
    val MINTTM3 = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Mintt MinttPoro */
    val MINTTPORO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Mintt MINTT_T11 */
    val MINTT_T11 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mintt P25 */
    val P25 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mintt P25+ */
    val P25_720X1612 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Mintt Rival_2 */
    val RIVAL_2 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Mintt T3 */
    val T3 = "spec:width=800,height=1340,unit=px,dpi=213"

    /** Mintt ULTRAMINTT A5 */
    val ULTRAMINTT_A5 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Mintt ULTRAMINTT_A6 */
    val ULTRAMINTT_A6 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mintt UltraMinttT10 */
    val ULTRAMINTTT10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mintt UltraMinttT2 */
    val ULTRAMINTTT2 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Mintt ULTRAMINTT_X6 */
    val ULTRAMINTT_X6 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mintt ULTRAMINTT Y3 */
    val ULTRAMINTT_Y3 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Mintt ULTRAMINTT Y5 */
    val ULTRAMINTT_Y5 = "spec:width=1080,height=2340,unit=px,dpi=480"

}
