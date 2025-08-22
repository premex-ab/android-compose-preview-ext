package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Victurio device specifications for Android Compose previews.
 *
 * This extension provides Victurio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Victurio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Victurio get() = object {
    /** Victurio VI108 */
    val VI108 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Victurio VI86 */
    val VI86 = "spec:width=600,height=1024,unit=px,dpi=160"

}
