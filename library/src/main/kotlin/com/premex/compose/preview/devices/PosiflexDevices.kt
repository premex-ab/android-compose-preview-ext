package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Posiflex device specifications for Android Compose previews.
 *
 * This extension provides Posiflex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Posiflex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Posiflex get() = object {
    /** Posiflex MK_1000 */
    val MK_1000 = "spec:width=768,height=1366,unit=px,dpi=160"

}
