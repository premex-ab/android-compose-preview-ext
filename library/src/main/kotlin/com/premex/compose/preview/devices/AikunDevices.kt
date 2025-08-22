package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aikun device specifications for Android Compose previews.
 *
 * This extension provides Aikun device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aikun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aikun get() = object {
    /** Aikun EDSTAR LC-TS08S */
    val EDSTAR_LC_TS08S = "spec:width=800,height=1280,unit=px,dpi=213"

}
