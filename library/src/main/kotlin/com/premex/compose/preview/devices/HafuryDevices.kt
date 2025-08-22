package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hafury device specifications for Android Compose previews.
 *
 * This extension provides Hafury device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hafury.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hafury get() = object {
    /** Hafury A7 */
    val A7 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Hafury G20 */
    val G20 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Hafury GT20 */
    val GT20 = "spec:width=1080,height=2310,unit=px,dpi=480"

    /** Hafury HAFURY MIX */
    val HAFURY_MIX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hafury HAFURY UMAX */
    val HAFURY_UMAX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hafury K30 */
    val K30 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hafury K30 PRO */
    val K30_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hafury M20 */
    val M20 = "spec:width=442,height=960,unit=px,dpi=240"

    /** Hafury MEET */
    val MEET = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Hafury NOTE 10 */
    val NOTE_10 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Hafury V1 */
    val V1 = "spec:width=1080,height=2408,unit=px,dpi=400"

}
