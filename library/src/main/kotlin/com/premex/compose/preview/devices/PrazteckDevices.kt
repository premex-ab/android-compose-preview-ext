package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Prazteck device specifications for Android Compose previews.
 *
 * This extension provides Prazteck device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Prazteck.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Prazteck get() = object {
    /** Prazteck PT7EduPad */
    val PT7EDUPAD = "spec:width=600,height=1024,unit=px,dpi=160"

}
