package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tanoshi device specifications for Android Compose previews.
 *
 * This extension provides Tanoshi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tanoshi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tanoshi get() = object {
    /** Tanoshi TTBKB10-01 */
    val TTBKB10_01 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Tanoshi TTBKB10-A1 */
    val TTBKB10_A1 = "spec:width=800,height=1280,unit=px,dpi=160"

}
