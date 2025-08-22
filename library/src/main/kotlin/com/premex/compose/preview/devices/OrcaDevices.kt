package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Orca device specifications for Android Compose previews.
 *
 * This extension provides Orca device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Orca.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Orca get() = object {
    /** Orca O-0202 */
    val O_0202 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
