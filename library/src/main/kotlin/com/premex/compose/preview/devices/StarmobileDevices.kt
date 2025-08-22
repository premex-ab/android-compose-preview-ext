package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Starmobile device specifications for Android Compose previews.
 *
 * This extension provides Starmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Starmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Starmobile get() = object {
    /** Starmobile Mobiistar_Zumbo_J2 */
    val MOBIISTAR_ZUMBO_J2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Starmobile PLAY Click LTE */
    val PLAY_CLICK_LTE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Starmobile UP Prime */
    val UP_PRIME = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Starmobile Y11 */
    val Y11 = "spec:width=480,height=800,unit=px,dpi=240"

}
