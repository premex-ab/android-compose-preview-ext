package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fatarus device specifications for Android Compose previews.
 *
 * This extension provides Fatarus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fatarus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fatarus get() = object {
    /** Fatarus K10 */
    val K10 = "spec:width=800,height=1332,unit=px,dpi=240"

}
