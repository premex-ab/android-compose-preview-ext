package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * _7mobile device specifications for Android Compose previews.
 *
 * This extension provides _7mobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices._7mobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices._7mobile get() = object {
    /** _7mobile Kamba 2 */
    val KAMBA_2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** _7mobile Swegue 2 */
    val SWEGUE_2 = "spec:width=480,height=996,unit=px,dpi=240"

}
