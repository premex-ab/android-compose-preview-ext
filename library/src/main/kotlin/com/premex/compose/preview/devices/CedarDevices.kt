package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cedar device specifications for Android Compose previews.
 *
 * This extension provides Cedar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cedar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cedar get() = object {
    /** Cedar Cedar CT8X2 */
    val CEDAR_CT8X2 = "spec:width=800,height=1280,unit=px,dpi=240"

}
