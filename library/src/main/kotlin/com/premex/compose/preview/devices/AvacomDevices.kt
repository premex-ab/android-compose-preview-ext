package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Avacom device specifications for Android Compose previews.
 *
 * This extension provides Avacom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Avacom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Avacom get() = object {
    /** Avacom AVT015 */
    val AVT015 = "spec:width=800,height=1280,unit=px,dpi=160"

}
