package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gearmobile device specifications for Android Compose previews.
 *
 * This extension provides Gearmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gearmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gearmobile get() = object {
    /** Gearmobile Feel_1008S */
    val FEEL_1008S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Gearmobile Gear_PRO */
    val GEAR_PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Gearmobile Gear_PRO2 */
    val GEAR_PRO2 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Gearmobile GM10 */
    val GM10 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gearmobile GM30 */
    val GM30 = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Gearmobile GM7 */
    val GM7 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Gearmobile Space_Pro */
    val SPACE_PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

}
