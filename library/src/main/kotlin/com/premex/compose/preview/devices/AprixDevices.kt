package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aprix device specifications for Android Compose previews.
 *
 * This extension provides Aprix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aprix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aprix get() = object {
    /** Aprix Tab1066 */
    val TAB1066 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Aprix Tab_X2 */
    val TAB_X2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aprix TabX4 */
    val TABX4 = "spec:width=800,height=1280,unit=px,dpi=160"

}
