package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Prixton device specifications for Android Compose previews.
 *
 * This extension provides Prixton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Prixton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Prixton get() = object {
    /** Prixton Expert */
    val EXPERT = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prixton Nova */
    val NOVA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prixton T9120_EEA */
    val T9120_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

}
