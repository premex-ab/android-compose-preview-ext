package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Roadquest device specifications for Android Compose previews.
 *
 * This extension provides Roadquest device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Roadquest.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Roadquest get() = object {
    /** Roadquest RoadQuest */
    val ROADQUEST = "spec:width=800,height=1280,unit=px,dpi=160"

}
