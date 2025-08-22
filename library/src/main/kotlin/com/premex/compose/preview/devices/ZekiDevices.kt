package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zeki device specifications for Android Compose previews.
 *
 * This extension provides Zeki device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zeki.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zeki get() = object {
    /** Zeki TBDV986 */
    val TBDV986 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Zeki TBOG1034 */
    val TBOG1034 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Zeki 	TBQG1031 */
    val TBQG1031 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Zeki TBQG1038 */
    val TBQG1038 = "spec:width=600,height=1024,unit=px,dpi=160"

}
