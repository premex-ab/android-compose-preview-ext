package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ssmooth device specifications for Android Compose previews.
 *
 * This extension provides Ssmooth device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ssmooth.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ssmooth get() = object {
    /** Ssmooth NOVA 6.5 */
    val NOVA_6_5 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ssmooth Smooth_5 */
    val SMOOTH_5 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ssmooth Smooth 5.0 2022 */
    val SMOOTH_5_0_2022 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Ssmooth Smooth 5.5 Lite */
    val SMOOTH_5_5_LITE = "spec:width=480,height=960,unit=px,dpi=213"

    /** Ssmooth Smooth 5.5 MAX */
    val SMOOTH_5_5_MAX = "spec:width=480,height=960,unit=px,dpi=213"

    /** Ssmooth Smooth 6.0 */
    val SMOOTH_6_0 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Ssmooth Smooth6_1 */
    val SMOOTH6_1 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Ssmooth Smooth 6.26 Lite */
    val SMOOTH_6_26_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Ssmooth Smooth 6.26 Max */
    val SMOOTH_6_26_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Ssmooth Smooth 6.26 Pro */
    val SMOOTH_6_26_PRO = "spec:width=720,height=1520,unit=px,dpi=300"

    /** Ssmooth Smooth 6.5 */
    val SMOOTH_6_5 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ssmooth Smooth_8GT */
    val SMOOTH_8GT = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ssmooth Smooth Note 6.8 */
    val SMOOTH_NOTE_6_8 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ssmooth SMV15523216 */
    val SMV15523216 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Ssmooth Vision */
    val VISION = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ssmooth Vision Plus */
    val VISION_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

}
