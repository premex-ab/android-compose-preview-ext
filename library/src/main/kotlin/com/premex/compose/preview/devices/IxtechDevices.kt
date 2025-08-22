package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ixtech device specifications for Android Compose previews.
 *
 * This extension provides Ixtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ixtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ixtech get() = object {
    /** Ixtech IX1011 */
    val IX1011 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ixtech IX1012 */
    val IX1012 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Ixtech IX1013 */
    val IX1013 = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Ixtech IX701 */
    val IX701 = "spec:width=600,height=1024,unit=px,dpi=160"

}
