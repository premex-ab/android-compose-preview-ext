package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lnmbbs device specifications for Android Compose previews.
 *
 * This extension provides Lnmbbs device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lnmbbs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lnmbbs get() = object {
    /** Lnmbbs H11-EEA */
    val H11_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Lnmbbs L20 */
    val L20 = "spec:width=800,height=1280,unit=px,dpi=186"

    /** Lnmbbs L201-EEA */
    val L201_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Lnmbbs L20-EEA */
    val L20_EEA = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Lnmbbs L211 */
    val L211 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lnmbbs L23 */
    val L23 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Lnmbbs L23-EEA */
    val L23_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Lnmbbs L28-EEA */
    val L28_EEA = "spec:width=800,height=1280,unit=px,dpi=186"

    /** Lnmbbs L60 */
    val L60 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Lnmbbs L80_US */
    val L80_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lnmbbs P401 */
    val P401 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Lnmbbs P40-EEA */
    val P40_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

}
