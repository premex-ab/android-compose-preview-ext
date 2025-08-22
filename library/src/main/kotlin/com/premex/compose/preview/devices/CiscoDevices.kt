package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cisco device specifications for Android Compose previews.
 *
 * This extension provides Cisco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cisco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cisco get() = object {
    /** Cisco CP-860S */
    val CP_860S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Cisco Desktop Collaboration Experience DX80 */
    val DESKTOP_COLLABORATION_EXPERIENCE_DX80 = "spec:width=1032,height=1920,unit=px,dpi=160"

}
