package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xploretechnologies device specifications for Android Compose previews.
 *
 * This extension provides Xploretechnologies device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xploretechnologies.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xploretechnologies get() = object {
    /** Xploretechnologies M6 */
    val M6 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Xploretechnologies XP8105 */
    val XP8105 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xploretechnologies XP8105A */
    val XP8105A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xploretechnologies XSLATE_D10 */
    val XSLATE_D10 = "spec:width=768,height=1366,unit=px,dpi=160"

}
