package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wizphone device specifications for Android Compose previews.
 *
 * This extension provides Wizphone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wizphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wizphone get() = object {
    /** Wizphone Arc8 */
    val ARC8 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Wizphone Slate10 */
    val SLATE10 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
