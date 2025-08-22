package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zikkz device specifications for Android Compose previews.
 *
 * This extension provides Zikkz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zikkz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zikkz get() = object {
    /** Zikkz ZIK_W1027 */
    val ZIK_W1027 = "spec:width=800,height=1280,unit=px,dpi=213"

}
