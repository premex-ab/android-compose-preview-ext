package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Abxylute device specifications for Android Compose previews.
 *
 * This extension provides Abxylute device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Abxylute.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Abxylute get() = object {
    /** Abxylute abxylute_one */
    val ABXYLUTE_ONE = "spec:width=1080,height=1920,unit=px,dpi=320"

}
