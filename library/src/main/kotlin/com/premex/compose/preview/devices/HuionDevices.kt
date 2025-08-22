package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Huion device specifications for Android Compose previews.
 *
 * This extension provides Huion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Huion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Huion get() = object {
    /** Huion KamvasSlate10 */
    val KAMVASSLATE10 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Huion KamvasSlate10_EEA */
    val KAMVASSLATE10_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Huion KT1101_EEA */
    val KT1101_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Huion KT1201 */
    val KT1201 = "spec:width=1600,height=2176,unit=px,dpi=320"

}
