package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Insane device specifications for Android Compose previews.
 *
 * This extension provides Insane device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Insane.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Insane get() = object {
    /** Insane INSANE_V10 */
    val INSANE_V10 = "spec:width=1200,height=1920,unit=px,dpi=340"

}
