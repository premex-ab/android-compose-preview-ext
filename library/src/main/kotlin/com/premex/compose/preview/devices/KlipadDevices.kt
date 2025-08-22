package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Klipad device specifications for Android Compose previews.
 *
 * This extension provides Klipad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Klipad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Klipad get() = object {
    /** Klipad KL2018R */
    val KL2018R = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Klipad KL2108NBE */
    val KL2108NBE = "spec:width=800,height=1332,unit=px,dpi=160"

    /** Klipad KL2109NB_EEA */
    val KL2109NB_EEA = "spec:width=768,height=1366,unit=px,dpi=160"

    /** Klipad KL3669A */
    val KL3669A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Klipad KL3669_EEA */
    val KL3669_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Klipad KL4889B_EEA */
    val KL4889B_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Klipad KL4889C */
    val KL4889C = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Klipad KL4890 */
    val KL4890 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Klipad KL4891 */
    val KL4891 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Klipad KL4898 */
    val KL4898 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Klipad KL4898_A50 */
    val KL4898_A50 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Klipad KL500 */
    val KL500 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Klipad KL502 */
    val KL502 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Klipad KL503 */
    val KL503 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Klipad KL505 */
    val KL505 = "spec:width=480,height=854,unit=px,dpi=220"

    /** Klipad KL600 */
    val KL600 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Klipad KL600B */
    val KL600B = "spec:width=540,height=960,unit=px,dpi=240"

    /** Klipad KL601 */
    val KL601 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Klipad KL602 */
    val KL602 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Klipad KL605_EEA */
    val KL605_EEA = "spec:width=480,height=960,unit=px,dpi=240"

    /** Klipad KL608 */
    val KL608 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Klipad KL628KO */
    val KL628KO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Klipad KL_6888 */
    val KL_6888 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Klipad KL6889B */
    val KL6889B = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Klipad KL7590_eea */
    val KL7590_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Klipad KL7591 */
    val KL7591 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Klipad KL8889 */
    val KL8889 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Klipad KL9878 */
    val KL9878 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Klipad KL9878AE */
    val KL9878AE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Klipad KL9878A_EEA */
    val KL9878A_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Klipad KLIPAD */
    val KLIPAD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Klipad KLIPAD_SMART_I746 */
    val KLIPAD_SMART_I746 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Klipad V355 */
    val V355 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Klipad V355B */
    val V355B = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Klipad V356 */
    val V356 = "spec:width=480,height=960,unit=px,dpi=240"

}
