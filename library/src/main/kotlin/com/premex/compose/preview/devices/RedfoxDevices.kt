package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Redfox device specifications for Android Compose previews.
 *
 * This extension provides Redfox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Redfox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Redfox get() = object {
    /** Redfox P11 */
    val P11 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Redfox Valuer_V8 */
    val VALUER_V8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Redfox Wizpad_Valuer_R10S */
    val WIZPAD_VALUER_R10S = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Redfox Wizpad_Valuer_R10X */
    val WIZPAD_VALUER_R10X = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Redfox Wizpad_Valuer_V8 */
    val WIZPAD_VALUER_V8 = "spec:width=800,height=1280,unit=px,dpi=213"

}
