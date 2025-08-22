package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Octopus device specifications for Android Compose previews.
 *
 * This extension provides Octopus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Octopus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Octopus get() = object {
    /** Octopus Octopus_One */
    val OCTOPUS_ONE = "spec:width=800,height=1280,unit=px,dpi=213"

}
