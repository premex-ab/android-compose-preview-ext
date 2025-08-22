package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aupo device specifications for Android Compose previews.
 *
 * This extension provides Aupo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aupo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aupo get() = object {
    /** Aupo AUPO_Zeus_10_Pro  */
    val AUPO_ZEUS_10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Aupo AUPO_Zeus_10_Pro_ROW */
    val AUPO_ZEUS_10_PRO_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

}
