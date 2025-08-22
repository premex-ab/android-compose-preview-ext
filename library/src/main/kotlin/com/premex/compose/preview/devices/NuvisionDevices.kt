package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nuvision device specifications for Android Compose previews.
 *
 * This extension provides Nuvision device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nuvision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nuvision get() = object {
    /** Nuvision TM800A740M */
    val TM800A740M = "spec:width=800,height=1280,unit=px,dpi=160"

}
