package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Uniqcell device specifications for Android Compose previews.
 *
 * This extension provides Uniqcell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Uniqcell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Uniqcell get() = object {
    /** Uniqcell D10 */
    val D10 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Uniqcell D7 */
    val D7 = "spec:width=600,height=1024,unit=px,dpi=180"

    /** Uniqcell UNI 10X */
    val UNI_10X = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Uniqcell UNI GO */
    val UNI_GO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Uniqcell UNIQ0122 */
    val UNIQ0122 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Uniqcell UNIQCELL_A4 */
    val UNIQCELL_A4 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Uniqcell UNIQCELL_A55 */
    val UNIQCELL_A55 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Uniqcell UNI X */
    val UNI_X = "spec:width=720,height=1600,unit=px,dpi=320"

}
