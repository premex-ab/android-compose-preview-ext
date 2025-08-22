package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ewis device specifications for Android Compose previews.
 *
 * This extension provides Ewis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ewis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ewis get() = object {
    /** Ewis OCTA-T700M */
    val OCTA_T700M = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ewis OCTA-T700M-T2 */
    val OCTA_T700M_T2 = "spec:width=800,height=1280,unit=px,dpi=160"

}
