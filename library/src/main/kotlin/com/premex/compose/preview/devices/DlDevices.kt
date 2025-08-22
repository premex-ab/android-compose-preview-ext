package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dl device specifications for Android Compose previews.
 *
 * This extension provides Dl device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dl get() = object {
    /** Dl 3420 */
    val _3420 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dl Creative kids */
    val CREATIVE_KIDS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dl Creative Tab */
    val CREATIVE_TAB = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dl Horizon Tab T10 */
    val HORIZON_TAB_T10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dl Mobi Tab */
    val MOBI_TAB = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dl Sabichões */
    val SABICH_ES = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dl TabFácil */
    val TABF_CIL = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Dl TabKids Plus */
    val TABKIDS_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dl Tablet_DL_3724 */
    val TABLET_DL_3724 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dl X_Quad_Pro */
    val X_QUAD_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

}
