package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Agmmobile device specifications for Android Compose previews.
 *
 * This extension provides Agmmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Agmmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Agmmobile get() = object {
    /** Agmmobile AGM Glory G1   */
    val AGM_GLORY_G1 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Agmmobile  AGM Glory_G1S */
    val AGM_GLORY_G1S = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Agmmobile AGM H3 */
    val AGM_H3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Agmmobile AGM H5 */
    val AGM_H5 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Agmmobile AGM_H5_PRO */
    val AGM_H5_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Agmmobile AGM_H6 */
    val AGM_H6 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Agmmobile AGM_H_MAX */
    val AGM_H_MAX = "spec:width=720,height=1612,unit=px,dpi=480"

    /** Agmmobile AGM_Note_N1 */
    val AGM_NOTE_N1 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Agmmobile AGM_PAD_P1 */
    val AGM_PAD_P1 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Agmmobile AGM_PAD_P2 */
    val AGM_PAD_P2 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Agmmobile AGM_PAD_P2W_EEA */
    val AGM_PAD_P2W_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Agmmobile AGM_PAD_T1 */
    val AGM_PAD_T1 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Agmmobile AGM_PAD_T1_WIFI */
    val AGM_PAD_T1_WIFI = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Agmmobile AGM_PAD_T2 */
    val AGM_PAD_T2 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Agmmobile AGM_PAD_T3 */
    val AGM_PAD_T3 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Agmmobile AGM_X6 */
    val AGM_X6 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Agmmobile Android_Tablet */
    val ANDROID_TABLET = "spec:width=1200,height=2000,unit=px,dpi=320"

}
