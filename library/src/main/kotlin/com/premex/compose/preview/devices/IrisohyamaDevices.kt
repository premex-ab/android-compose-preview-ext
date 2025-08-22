package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Irisohyama device specifications for Android Compose previews.
 *
 * This extension provides Irisohyama device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Irisohyama.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Irisohyama get() = object {
    /** Irisohyama IB-75UED01B */
    val IB_75UED01B = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Irisohyama LUCA Tablet TM152 */
    val LUCA_TABLET_TM152 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Irisohyama TA10E1W63 */
    val TA10E1W63 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Irisohyama TE081N1 */
    val TE081N1 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Irisohyama TE082M2 */
    val TE082M2 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Irisohyama TE083M3 */
    val TE083M3 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Irisohyama TE084 */
    val TE084 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Irisohyama TE08D1M64 */
    val TE08D1M64 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Irisohyama TE08D2M64 */
    val TE08D2M64 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Irisohyama TE101N1 */
    val TE101N1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Irisohyama TE102M3 */
    val TE102M3 = "spec:width=800,height=1280,unit=px,dpi=186"

    /** Irisohyama TE103M3 */
    val TE103M3 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Irisohyama TE104 */
    val TE104 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Irisohyama TE10D1M64 */
    val TE10D1M64 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Irisohyama TE10D2M64 */
    val TE10D2M64 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Irisohyama TM082 */
    val TM082 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Irisohyama TM083 */
    val TM083 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Irisohyama TM101 */
    val TM101 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Irisohyama TM102 */
    val TM102 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Irisohyama TM103 */
    val TM103 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Irisohyama TM153M6 */
    val TM153M6 = "spec:width=1080,height=1920,unit=px,dpi=240"

}
