package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Leaderhub device specifications for Android Compose previews.
 *
 * This extension provides Leaderhub device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Leaderhub.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Leaderhub get() = object {
    /** Leaderhub S19_EEA */
    val S19_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

}
