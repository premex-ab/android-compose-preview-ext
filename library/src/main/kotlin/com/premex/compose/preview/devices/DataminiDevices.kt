package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Datamini device specifications for Android Compose previews.
 *
 * This extension provides Datamini device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Datamini.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Datamini get() = object {
    /** Datamini K508101 */
    val K508101 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Datamini T104G_T610 */
    val T104G_T610 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Datamini T104G_T618 */
    val T104G_T618 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Datamini T8004G */
    val T8004G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Datamini T84G */
    val T84G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Datamini T84G_T310_332 */
    val T84G_T310_332 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Datamini TPOS74G-IGF720 */
    val TPOS74G_IGF720 = "spec:width=600,height=1024,unit=px,dpi=160"

}
