package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Goldentec device specifications for Android Compose previews.
 *
 * This extension provides Goldentec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Goldentec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Goldentec get() = object {
    /** Goldentec GT_METAL_TAB10 */
    val GT_METAL_TAB10 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Goldentec GT_TAB10 */
    val GT_TAB10 = "spec:width=800,height=1280,unit=px,dpi=178"

    /** Goldentec GT_TAB7 */
    val GT_TAB7 = "spec:width=600,height=1024,unit=px,dpi=192"

}
