package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * M3mobile device specifications for Android Compose previews.
 *
 * This extension provides M3mobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.M3mobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.M3mobile get() = object {
    /** M3mobile M3-SL10 */
    val M3_SL10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** M3mobile M3 SL20 */
    val M3_SL20 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** M3mobile M3SL20K */
    val M3SL20K = "spec:width=480,height=800,unit=px,dpi=202"

    /** M3mobile M3SL20PLUS */
    val M3SL20PLUS = "spec:width=720,height=1440,unit=px,dpi=202"

    /** M3mobile M3SM15N_EEA */
    val M3SM15N_EEA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** M3mobile M3SM15X_EEA */
    val M3SM15X_EEA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** M3mobile M3 SM20 */
    val M3_SM20 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** M3mobile M3UL20F_EEA */
    val M3UL20F_EEA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** M3mobile M3UL20W_EEA */
    val M3UL20W_EEA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** M3mobile M3UL20X_EEA */
    val M3UL20X_EEA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** M3mobile M3 US20W */
    val M3_US20W = "spec:width=480,height=800,unit=px,dpi=240"

    /** M3mobile M3 US20X */
    val M3_US20X = "spec:width=480,height=800,unit=px,dpi=240"

}
