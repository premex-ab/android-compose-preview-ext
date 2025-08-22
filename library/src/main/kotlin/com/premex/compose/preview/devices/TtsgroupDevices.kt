package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ttsgroup device specifications for Android Compose previews.
 *
 * This extension provides Ttsgroup device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ttsgroup.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ttsgroup get() = object {
    /** Ttsgroup IT10268 */
    val IT10268 = "spec:width=800,height=1280,unit=px,dpi=213"

}
