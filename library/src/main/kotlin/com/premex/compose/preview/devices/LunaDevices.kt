package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Luna device specifications for Android Compose previews.
 *
 * This extension provides Luna device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Luna.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Luna get() = object {
    /** Luna LUNA_G6 */
    val LUNA_G6 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Luna LUNA_G6E */
    val LUNA_G6E = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Luna LUNA G9 */
    val LUNA_G9 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Luna LUNA T10 */
    val LUNA_T10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Luna LUNA V6 */
    val LUNA_V6 = "spec:width=1080,height=2248,unit=px,dpi=480"

    /** Luna LUNA V6 3GB */
    val LUNA_V6_3GB = "spec:width=720,height=1600,unit=px,dpi=320"

}
