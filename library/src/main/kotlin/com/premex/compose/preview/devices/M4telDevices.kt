package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * M4tel device specifications for Android Compose previews.
 *
 * This extension provides M4tel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.M4tel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.M4tel get() = object {
    /** M4tel M4 R2 */
    val M4_R2 = "spec:width=480,height=960,unit=px,dpi=240"

    /** M4tel M4 SS4450 */
    val M4_SS4450 = "spec:width=480,height=854,unit=px,dpi=240"

    /** M4tel M4 SS4455 */
    val M4_SS4455 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** M4tel M4 SS4457 */
    val M4_SS4457 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** M4tel R2 Plus */
    val R2_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

}
