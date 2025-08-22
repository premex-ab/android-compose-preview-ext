package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tesco device specifications for Android Compose previews.
 *
 * This extension provides Tesco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tesco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tesco get() = object {
    /** Tesco hudl 2 */
    val HUDL_2 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Tesco Hudl HT7S3 */
    val HUDL_HT7S3 = "spec:width=900,height=1440,unit=px,dpi=240"

}
