package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Svitoo device specifications for Android Compose previews.
 *
 * This extension provides Svitoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Svitoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Svitoo get() = object {
    /** Svitoo P08 */
    val P08 = "spec:width=800,height=1340,unit=px,dpi=213"

    /** Svitoo P10_pro */
    val P10_PRO = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Svitoo P11_pro */
    val P11_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Svitoo P11_pro_EEA */
    val P11_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Svitoo SVITOO_P10 */
    val SVITOO_P10 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Svitoo TAB_P12_EEA */
    val TAB_P12_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

}
