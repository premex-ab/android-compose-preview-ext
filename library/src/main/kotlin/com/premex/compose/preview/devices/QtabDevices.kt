package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Qtab device specifications for Android Compose previews.
 *
 * This extension provides Qtab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Qtab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Qtab get() = object {
    /** Qtab V5 */
    val V5 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Qtab V5_Plus */
    val V5_PLUS = "spec:width=600,height=1024,unit=px,dpi=213"

}
