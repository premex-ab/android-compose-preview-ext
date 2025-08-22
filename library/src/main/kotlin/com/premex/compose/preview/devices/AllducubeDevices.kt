package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Allducube device specifications for Android Compose previews.
 *
 * This extension provides Allducube device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Allducube.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Allducube get() = object {
    /** Allducube T1001 */
    val T1001 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
