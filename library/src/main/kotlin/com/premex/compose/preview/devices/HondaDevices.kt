package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Honda device specifications for Android Compose previews.
 *
 * This extension provides Honda device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Honda.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Honda get() = object {
    /** Honda A-DA */
    val A_DA = "spec:width=480,height=800,unit=px,dpi=160"

}
