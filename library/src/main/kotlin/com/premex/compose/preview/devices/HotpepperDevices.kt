package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hotpepper device specifications for Android Compose previews.
 *
 * This extension provides Hotpepper device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hotpepper.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hotpepper get() = object {
    /** Hotpepper 15 Pro Max */
    val _15_PRO_MAX = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Hotpepper 18 Pro */
    val _18_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hotpepper 19 Pro Max */
    val _19_PRO_MAX = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Hotpepper Chilaca Plus */
    val CHILACA_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Hotpepper Datil */
    val DATIL = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Hotpepper DT10 */
    val DT10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hotpepper Ghost */
    val GHOST = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hotpepper HPPAP16 */
    val HPPAP16 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hotpepper HPPAP33 */
    val HPPAP33 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Hotpepper HPPH88C */
    val HPPH88C = "spec:width=576,height=1280,unit=px,dpi=260"

    /** Hotpepper K82A */
    val K82A = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Hotpepper KR10 */
    val KR10 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Hotpepper KT10 */
    val KT10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hotpepper Panca */
    val PANCA = "spec:width=480,height=960,unit=px,dpi=213"

    /** Hotpepper Pulla */
    val PULLA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Hotpepper Serrano */
    val SERRANO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Hotpepper Stylo 7plus */
    val STYLO_7PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Hotpepper T11 Pro */
    val T11_PRO = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Hotpepper VLE5 */
    val VLE5 = "spec:width=480,height=854,unit=px,dpi=240"

}
