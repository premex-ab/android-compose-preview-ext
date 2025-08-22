package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hope device specifications for Android Compose previews.
 *
 * This extension provides Hope device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hope.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hope get() = object {
    /** Hope S25u */
    val S25U = "spec:width=720,height=1600,unit=px,dpi=320"

}
