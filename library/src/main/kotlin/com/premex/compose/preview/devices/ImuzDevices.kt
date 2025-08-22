package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Imuz device specifications for Android Compose previews.
 *
 * This extension provides Imuz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Imuz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Imuz get() = object {
    /** Imuz EG104 */
    val EG104 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Imuz EG110 */
    val EG110 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Imuz G10 */
    val G10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Imuz IM-B101H */
    val IM_B101H = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Imuz IM-H031 */
    val IM_H031 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Imuz IM-H092L */
    val IM_H092L = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Imuz IM-H092W */
    val IM_H092W = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Imuz IMH101 */
    val IMH101 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Imuz IM-H261 */
    val IM_H261 = "spec:width=1600,height=2560,unit=px,dpi=280"

    /** Imuz IM-H842 */
    val IM_H842 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Imuz IM-L101 */
    val IM_L101 = "spec:width=800,height=1280,unit=px,dpi=480"

    /** Imuz IM-L801 */
    val IM_L801 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Imuz M101 */
    val M101 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Imuz muPAD102 */
    val MUPAD102 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Imuz muPAD104 */
    val MUPAD104 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Imuz muPAD_K10 */
    val MUPAD_K10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Imuz muPAD L10 */
    val MUPAD_L10 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Imuz muPADT7 */
    val MUPADT7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Imuz RA10 */
    val RA10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Imuz RG11 */
    val RG11 = "spec:width=1600,height=2560,unit=px,dpi=320"

}
