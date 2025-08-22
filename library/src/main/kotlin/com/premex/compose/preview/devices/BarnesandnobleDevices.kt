package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Barnesandnoble device specifications for Android Compose previews.
 *
 * This extension provides Barnesandnoble device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Barnesandnoble.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Barnesandnoble get() = object {
    /** Barnesandnoble BNTV460 */
    val BNTV460 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Barnesandnoble BNTV650 */
    val BNTV650 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Barnesandnoble Nook Tablet 7” */
    val NOOK_TABLET_7 = "spec:width=600,height=1024,unit=px,dpi=160"

}
