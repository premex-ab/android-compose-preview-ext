package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Itab device specifications for Android Compose previews.
 *
 * This extension provides Itab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Itab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Itab get() = object {
    /** Itab ITAB_X40L_Plus */
    val ITAB_X40L_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

}
