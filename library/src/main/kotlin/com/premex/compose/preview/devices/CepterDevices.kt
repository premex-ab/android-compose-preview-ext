package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cepter device specifications for Android Compose previews.
 *
 * This extension provides Cepter device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cepter.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cepter get() = object {
    /** Cepter CEPTERTAB101 */
    val CEPTERTAB101 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Cepter CEPTERTAB1095 */
    val CEPTERTAB1095 = "spec:width=1200,height=2000,unit=px,dpi=213"

    /** Cepter CEPTERTAB10E */
    val CEPTERTAB10E = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Cepter CEPTER-TAB-10L */
    val CEPTER_TAB_10L = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Cepter CEPTER-TAB-10S */
    val CEPTER_TAB_10S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Cepter CEPTERTABP12 */
    val CEPTERTABP12 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Cepter CTABERA101 */
    val CTABERA101 = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Cepter CTABEVOP12 */
    val CTABEVOP12 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Cepter CTABNEXUS */
    val CTABNEXUS = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Cepter CTABTERRA128 */
    val CTABTERRA128 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Cepter CTABTERRA256 */
    val CTABTERRA256 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Cepter CTABTITAN12 */
    val CTABTITAN12 = "spec:width=1600,height=2560,unit=px,dpi=320"

}
