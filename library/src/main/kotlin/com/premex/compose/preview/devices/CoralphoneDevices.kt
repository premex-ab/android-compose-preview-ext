package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Coralphone device specifications for Android Compose previews.
 *
 * This extension provides Coralphone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Coralphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Coralphone get() = object {
    /** Coralphone CoralPhone */
    val CORALPHONE = "spec:width=1080,height=2400,unit=px,dpi=480"

}
