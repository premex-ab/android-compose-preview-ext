package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Creato device specifications for Android Compose previews.
 *
 * This extension provides Creato device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Creato.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Creato get() = object {
    /** Creato DVT101B */
    val DVT101B = "spec:width=600,height=1024,unit=px,dpi=160"

}
