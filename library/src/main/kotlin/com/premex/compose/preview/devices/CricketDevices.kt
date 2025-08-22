package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cricket device specifications for Android Compose previews.
 *
 * This extension provides Cricket device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cricket.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cricket get() = object {
    /** Cricket Cricket Debut S2™ */
    val CRICKET_DEBUT_S2 = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Cricket Cricket® Dream 5G */
    val CRICKET_DREAM_5G = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Cricket Cricket® Icon 3 */
    val CRICKET_ICON_3 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Cricket Cricket® Icon 4 */
    val CRICKET_ICON_4 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Cricket Cricket Icon™6 */
    val CRICKET_ICON_6 = "spec:width=720,height=1600,unit=px,dpi=260"

    /** Cricket Cricket® Influence */
    val CRICKET_INFLUENCE = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Cricket Cricket® Innovate 5G */
    val CRICKET_INNOVATE_5G = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Cricket Cricket® Magic 5G */
    val CRICKET_MAGIC_5G = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Cricket Cricket Outlast™ 5G */
    val CRICKET_OUTLAST_5G = "spec:width=720,height=1600,unit=px,dpi=260"

    /** Cricket Cricket® Ovation 2 */
    val CRICKET_OVATION_2 = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Cricket Cricket® Splendor */
    val CRICKET_SPLENDOR = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Cricket DEMK4119 */
    val DEMK4119 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cricket 	DEMK4120 */
    val DEMK4120 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cricket SN304AE */
    val SN304AE = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Cricket U304AC */
    val U304AC = "spec:width=480,height=960,unit=px,dpi=213"

    /** Cricket U325AC */
    val U325AC = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cricket U705AC */
    val U705AC = "spec:width=720,height=1600,unit=px,dpi=300"

}
