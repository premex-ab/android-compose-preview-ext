package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bundymobile device specifications for Android Compose previews.
 *
 * This extension provides Bundymobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bundymobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bundymobile get() = object {
    /** Bundymobile BTOUCH7_PLUS */
    val BTOUCH7_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

}
