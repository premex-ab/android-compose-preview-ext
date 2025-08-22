package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Simplytab device specifications for Android Compose previews.
 *
 * This extension provides Simplytab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Simplytab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Simplytab get() = object {
    /** Simplytab S-101TAB */
    val S_101TAB = "spec:width=800,height=1280,unit=px,dpi=160"

}
