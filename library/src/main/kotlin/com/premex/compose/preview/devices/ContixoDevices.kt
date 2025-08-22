package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Contixo device specifications for Android Compose previews.
 *
 * This extension provides Contixo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Contixo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Contixo get() = object {
    /** Contixo CONTIXO_V8 */
    val CONTIXO_V8 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Contixo 	K101A */
    val K101A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Contixo K103 */
    val K103 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Contixo K103A */
    val K103A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Contixo K81 */
    val K81 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Contixo V10 */
    val V10 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Contixo V10A */
    val V10A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Contixo V10S */
    val V10S = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Contixo V10X */
    val V10X = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Contixo V11 */
    val V11 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Contixo V8 */
    val V8 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Contixo V8X */
    val V8X = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Contixo V9 */
    val V9 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Contixo V90 */
    val V90 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Contixo V9X */
    val V9X = "spec:width=600,height=1024,unit=px,dpi=160"

}
