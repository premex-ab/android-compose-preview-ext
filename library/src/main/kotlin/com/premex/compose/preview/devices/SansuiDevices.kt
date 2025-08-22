package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sansui device specifications for Android Compose previews.
 *
 * This extension provides Sansui device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sansui.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sansui get() = object {
    /** Sansui Grand */
    val GRAND = "spec:width=480,height=960,unit=px,dpi=240"

    /** Sansui Sansui_Nova */
    val SANSUI_NOVA = "spec:width=480,height=960,unit=px,dpi=240"

}
