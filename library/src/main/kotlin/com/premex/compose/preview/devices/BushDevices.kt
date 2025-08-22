package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bush device specifications for Android Compose previews.
 *
 * This extension provides Bush device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bush.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bush get() = object {
    /** Bush 5 android */
    val _5_ANDROID = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Bush Bush10Nou */
    val BUSH10NOU = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Bush BUSH SPIRA B3 10 TABLET */
    val BUSH_SPIRA_B3_10_TABLET = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Bush BUSH SPIRA B3 8 TABLET */
    val BUSH_SPIRA_B3_8_TABLET = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Bush SPIRA B4 5 */
    val SPIRA_B4_5 = "spec:width=720,height=1280,unit=px,dpi=280"

    /** Bush SPIRA E4X */
    val SPIRA_E4X = "spec:width=1080,height=1920,unit=px,dpi=400"

}
