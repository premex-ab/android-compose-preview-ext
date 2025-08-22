package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Logitec device specifications for Android Compose previews.
 *
 * This extension provides Logitec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Logitec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Logitec get() = object {
    /** Logitec LZ-AA10 */
    val LZ_AA10 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
