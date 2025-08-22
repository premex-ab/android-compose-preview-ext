package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Suaat device specifications for Android Compose previews.
 *
 * This extension provides Suaat device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Suaat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Suaat get() = object {
    /** Suaat S10_U_EEA */
    val S10_U_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Suaat S10_U_US */
    val S10_U_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Suaat S3_EEA */
    val S3_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Suaat S3_US */
    val S3_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Suaat S6_EEA */
    val S6_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Suaat S6_US */
    val S6_US = "spec:width=800,height=1280,unit=px,dpi=200"

}
