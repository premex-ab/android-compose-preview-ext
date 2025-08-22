package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Picassotab device specifications for Android Compose previews.
 *
 * This extension provides Picassotab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Picassotab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Picassotab get() = object {
    /** Picassotab PicassoTab_A10 */
    val PICASSOTAB_A10 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Picassotab PicassoTab_X11 */
    val PICASSOTAB_X11 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Picassotab PicassoTab_X11_2025 */
    val PICASSOTAB_X11_2025 = "spec:width=1200,height=2000,unit=px,dpi=240"

}
