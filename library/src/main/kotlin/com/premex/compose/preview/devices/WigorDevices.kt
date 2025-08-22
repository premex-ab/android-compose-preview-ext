package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wigor device specifications for Android Compose previews.
 *
 * This extension provides Wigor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wigor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wigor get() = object {
    /** Wigor V2 */
    val V2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wigor V3 */
    val V3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wigor V5 */
    val V5 = "spec:width=720,height=1512,unit=px,dpi=320"

}
