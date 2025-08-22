package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Beeline device specifications for Android Compose previews.
 *
 * This extension provides Beeline device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Beeline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Beeline get() = object {
    /** Beeline Beeline Tab Fast 2  */
    val BEELINE_TAB_FAST_2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Beeline Pro 6 */
    val PRO_6 = "spec:width=480,height=854,unit=px,dpi=240"

}
