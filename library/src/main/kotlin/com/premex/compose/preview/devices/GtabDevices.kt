package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gtab device specifications for Android Compose previews.
 *
 * This extension provides Gtab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gtab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gtab get() = object {
    /** Gtab C10 */
    val C10 = "spec:width=800,height=1280,unit=px,dpi=186"

    /** Gtab C10_1 */
    val C10_1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab C10_2 */
    val C10_2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab C10X */
    val C10X = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab C20 */
    val C20 = "spec:width=800,height=1280,unit=px,dpi=170"

    /** Gtab C3 */
    val C3 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Gtab C30 */
    val C30 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Gtab  C9  */
    val C9 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Gtab F1 */
    val F1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Gtab F10 */
    val F10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab F1_1 */
    val F1_1 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Gtab F2 */
    val F2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Gtab F2X */
    val F2X = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Gtab F4 */
    val F4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Gtab F8 */
    val F8 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Gtab F8_1 */
    val F8_1 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Gtab F8X */
    val F8X = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab G5 */
    val G5 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Gtab G9 */
    val G9 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Gtab  N271  */
    val N271 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Gtab N28 */
    val N28 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab N281 */
    val N281 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab P2000 */
    val P2000 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab P733 */
    val P733 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Gtab  PAD10  */
    val PAD10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab PAD10_PRO */
    val PAD10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab PL1000B */
    val PL1000B = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Gtab Q2 */
    val Q2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Gtab Q2S */
    val Q2S = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Gtab Q3 */
    val Q3 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Gtab Q4 */
    val Q4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Gtab Q5 */
    val Q5 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Gtab Q6 */
    val Q6 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Gtab S10 */
    val S10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab S12 */
    val S12 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Gtab S20 */
    val S20 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Gtab S3 */
    val S3 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab S30_1 */
    val S30_1 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Gtab S40 */
    val S40 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Gtab S40-1 */
    val S40_1 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Gtab S50 */
    val S50 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Gtab S50-pro */
    val S50_PRO = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Gtab S8 */
    val S8 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Gtab S8K_1 */
    val S8K_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Gtab S8K_2 */
    val S8K_2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Gtab S8X */
    val S8X = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Gtab T10 */
    val T10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab T11_1 */
    val T11_1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab T11_PRO */
    val T11_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab T8_1 */
    val T8_1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab T8S_1 */
    val T8S_1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab T9_1 */
    val T9_1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gtab Tablet */
    val TABLET = "spec:width=800,height=1280,unit=px,dpi=213"

}
