package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ghia device specifications for Android Compose previews.
 *
 * This extension provides Ghia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ghia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ghia get() = object {
    /** Ghia A7_3G */
    val A7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia A7_WF */
    val A7_WF = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GA7133 */
    val GA7133 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GA8N */
    val GA8N = "spec:width=1080,height=1440,unit=px,dpi=213"

    /** Ghia GA8N2 */
    val GA8N2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ghia GHIA_A1 */
    val GHIA_A1 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ghia GHIA_A7 */
    val GHIA_A7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GHIA_AXIS7 */
    val GHIA_AXIS7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GHIA_AXIS7P */
    val GHIA_AXIS7P = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GHIA_L1 */
    val GHIA_L1 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ghia GHIA_VECTOR_3G */
    val GHIA_VECTOR_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ghia GK133 */
    val GK133 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia  GK133M24  */
    val GK133M24 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GK133M3 */
    val GK133M3 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GK133N3 */
    val GK133N3 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GK133P24 */
    val GK133P24 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GK133S3 */
    val GK133S3 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GK133T3 */
    val GK133T3 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GK133V3 */
    val GK133V3 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GK523A24 */
    val GK523A24 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ghia GPND133 */
    val GPND133 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GPND133V4 */
    val GPND133V4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GRINV1 */
    val GRINV1 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Ghia GS3G */
    val GS3G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ghia GTA7PLUS */
    val GTA7PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GTA7WF */
    val GTA7WF = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GTAB718 */
    val GTAB718 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GTABKIDS */
    val GTABKIDS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GTABPND */
    val GTABPND = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GTKIDS7-100 */
    val GTKIDS7_100 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GTKIDS7A */
    val GTKIDS7A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GTKIDS7B */
    val GTKIDS7B = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GTKIDS7R */
    val GTKIDS7R = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GTKIDS7V */
    val GTKIDS7V = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GTPND7 */
    val GTPND7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GTTODD7 */
    val GTTODD7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia GTVR10S */
    val GTVR10S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ghia GVLTE13 */
    val GVLTE13 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ghia GVPNT */
    val GVPNT = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ghia TREO_TAB8G */
    val TREO_TAB8G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia VECTOR10.1 */
    val VECTOR10_1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ghia Vector_3G */
    val VECTOR_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ghia VECTOR_SLIM */
    val VECTOR_SLIM = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ghia ZEUS 3G */
    val ZEUS_3G = "spec:width=720,height=1280,unit=px,dpi=320"

}
