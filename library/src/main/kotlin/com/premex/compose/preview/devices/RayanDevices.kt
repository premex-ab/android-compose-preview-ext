package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rayan device specifications for Android Compose previews.
 *
 * This extension provides Rayan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rayan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rayan get() = object {
    /** Rayan AM_TAB_7_03 */
    val AM_TAB_7_03 = "spec:width=600,height=1024,unit=px,dpi=213"

}
