package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tellytablet device specifications for Android Compose previews.
 *
 * This extension provides Tellytablet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tellytablet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tellytablet get() = object {
    /** Tellytablet VM_MD_001 */
    val VM_MD_001 = "spec:width=1080,height=1920,unit=px,dpi=160"

}
