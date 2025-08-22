package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Beneve device specifications for Android Compose previews.
 *
 * This extension provides Beneve device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Beneve.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Beneve get() = object {
    /** Beneve M1036 */
    val M1036 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Beneve M1038_EEA */
    val M1038_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Beneve M51S */
    val M51S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Beneve M51S_EEA */
    val M51S_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Beneve M53 */
    val M53 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Beneve M53_EEA */
    val M53_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Beneve M55_EEA */
    val M55_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Beneve M7152 */
    val M7152 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Beneve M7152D1 */
    val M7152D1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Beneve M7152D1_EEA */
    val M7152D1_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Beneve M7152P_EEA */
    val M7152P_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

}
