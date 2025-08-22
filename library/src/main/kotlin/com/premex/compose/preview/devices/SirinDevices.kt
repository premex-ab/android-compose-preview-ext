package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sirin device specifications for Android Compose previews.
 *
 * This extension provides Sirin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sirin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sirin get() = object {
    /** Sirin FINNEY PHONE */
    val FINNEY_PHONE = "spec:width=1080,height=2160,unit=px,dpi=420"

}
