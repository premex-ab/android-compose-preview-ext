package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fireflymobile device specifications for Android Compose previews.
 *
 * This extension provides Fireflymobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fireflymobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fireflymobile get() = object {
    /** Fireflymobile INTENSE_XT */
    val INTENSE_XT = "spec:width=480,height=960,unit=px,dpi=240"

}
