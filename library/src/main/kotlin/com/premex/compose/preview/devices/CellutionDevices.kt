package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cellution device specifications for Android Compose previews.
 *
 * This extension provides Cellution device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cellution.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cellution get() = object {
    /** Cellution Cosmas */
    val COSMAS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Cellution COSMAS_T */
    val COSMAS_T = "spec:width=480,height=854,unit=px,dpi=240"

    /** Cellution COSMAS_TF */
    val COSMAS_TF = "spec:width=480,height=854,unit=px,dpi=240"

    /** Cellution COSMAS_X */
    val COSMAS_X = "spec:width=480,height=854,unit=px,dpi=240"

    /** Cellution CT_Cosmas_V */
    val CT_COSMAS_V = "spec:width=480,height=854,unit=px,dpi=240"

    /** Cellution IRIS */
    val IRIS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Cellution PADUA */
    val PADUA = "spec:width=480,height=960,unit=px,dpi=240"

    /** Cellution PADUA_1 */
    val PADUA_1 = "spec:width=480,height=960,unit=px,dpi=240"

}
