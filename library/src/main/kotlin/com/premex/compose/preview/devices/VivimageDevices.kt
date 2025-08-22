package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vivimage device specifications for Android Compose previews.
 *
 * This extension provides Vivimage device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vivimage.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vivimage get() = object {
    /** Vivimage E8 */
    val E8 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Vivimage VIVIMAGE_A10 */
    val VIVIMAGE_A10 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Vivimage VIVIMAGE_A10_EEA */
    val VIVIMAGE_A10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Vivimage VIVIMAGE_E10 */
    val VIVIMAGE_E10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Vivimage VIVIMAGE_E11 */
    val VIVIMAGE_E11 = "spec:width=1200,height=1920,unit=px,dpi=213"

}
