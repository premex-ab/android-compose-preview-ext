package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Prime device specifications for Android Compose previews.
 *
 * This extension provides Prime device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Prime.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Prime get() = object {
    /** Prime X6_Pro */
    val X6_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

}
