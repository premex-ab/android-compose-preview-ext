package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Didik device specifications for Android Compose previews.
 *
 * This extension provides Didik device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Didik.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Didik get() = object {
    /** Didik DT24Plus */
    val DT24PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

}
