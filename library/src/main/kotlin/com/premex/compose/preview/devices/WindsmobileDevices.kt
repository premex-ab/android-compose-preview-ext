package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Windsmobile device specifications for Android Compose previews.
 *
 * This extension provides Windsmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Windsmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Windsmobile get() = object {
    /** Windsmobile WINDS-T3 */
    val WINDS_T3 = "spec:width=600,height=1024,unit=px,dpi=160"

}
