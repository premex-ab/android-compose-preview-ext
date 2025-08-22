package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cbnmedia device specifications for Android Compose previews.
 *
 * This extension provides Cbnmedia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cbnmedia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cbnmedia get() = object {
    /** Cbnmedia g-mee1 */
    val G_MEE1 = "spec:width=480,height=854,unit=px,dpi=240"

}
