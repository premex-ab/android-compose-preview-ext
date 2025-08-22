package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bilimbook device specifications for Android Compose previews.
 *
 * This extension provides Bilimbook device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bilimbook.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bilimbook get() = object {
    /** Bilimbook BilimBook_mini */
    val BILIMBOOK_MINI = "spec:width=800,height=1280,unit=px,dpi=213"

}
