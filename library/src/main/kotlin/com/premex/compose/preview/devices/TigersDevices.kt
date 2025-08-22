package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tigers device specifications for Android Compose previews.
 *
 * This extension provides Tigers device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tigers.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tigers get() = object {
    /** Tigers TIS001-S3 */
    val TIS001_S3 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Tigers TIS001_S4 */
    val TIS001_S4 = "spec:width=480,height=960,unit=px,dpi=220"

}
