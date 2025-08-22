package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mirage device specifications for Android Compose previews.
 *
 * This extension provides Mirage device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mirage.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mirage get() = object {
    /** Mirage 62S */
    val _62S = "spec:width=480,height=854,unit=px,dpi=240"

    /** Mirage 82S */
    val _82S = "spec:width=720,height=1280,unit=px,dpi=320"

}
