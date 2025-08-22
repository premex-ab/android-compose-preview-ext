package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kelyx device specifications for Android Compose previews.
 *
 * This extension provides Kelyx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kelyx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kelyx get() = object {
    /** Kelyx AKS01_KL783 */
    val AKS01_KL783 = "spec:width=600,height=1024,unit=px,dpi=160"

}
