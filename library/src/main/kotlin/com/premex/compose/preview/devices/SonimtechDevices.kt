package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sonimtech device specifications for Android Compose previews.
 *
 * This extension provides Sonimtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sonimtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sonimtech get() = object {
    /** Sonimtech Ex-Handy 09 */
    val EX_HANDY_09 = "spec:width=320,height=432,unit=px,dpi=160"

    /** Sonimtech RS60 */
    val RS60 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sonimtech RS80 */
    val RS80 = "spec:width=1200,height=1920,unit=px,dpi=480"

    /** Sonimtech Smart-Ex 01 */
    val SMART_EX_01 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Sonimtech XP10 */
    val XP10 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Sonimtech XP400 */
    val XP400 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Sonimtech XP6 */
    val XP6 = "spec:width=320,height=432,unit=px,dpi=160"

    /** Sonimtech XP7 */
    val XP7 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Sonimtech XP8 */
    val XP8 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Sonimtech XP Pro */
    val XP_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Sonimtech XP Pro 5G */
    val XP_PRO_5G = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Sonimtech XP Pro Thermal */
    val XP_PRO_THERMAL = "spec:width=1080,height=2408,unit=px,dpi=480"

}
