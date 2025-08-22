package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Odea device specifications for Android Compose previews.
 *
 * This extension provides Odea device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Odea.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Odea get() = object {
    /** Odea A10_EEA */
    val A10_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Odea A10_ROW */
    val A10_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Odea A11_ROW */
    val A11_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Odea A12_ROW */
    val A12_ROW = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Odea S11_EEA */
    val S11_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Odea S11_ROW */
    val S11_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

}
