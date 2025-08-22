package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Innjoo device specifications for Android Compose previews.
 *
 * This extension provides Innjoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Innjoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Innjoo get() = object {
    /** Innjoo F102 */
    val F102 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Innjoo F106_Plus */
    val F106_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Innjoo Superb */
    val SUPERB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Innjoo VOOM_TAB_LTE */
    val VOOM_TAB_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

}
