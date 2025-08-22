package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Digidragon device specifications for Android Compose previews.
 *
 * This extension provides Digidragon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Digidragon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Digidragon get() = object {
    /** Digidragon 708Z */
    val _708Z = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Digidragon DS502 */
    val DS502 = "spec:width=480,height=960,unit=px,dpi=220"

    /** Digidragon DS571 */
    val DS571 = "spec:width=540,height=1140,unit=px,dpi=240"

    /** Digidragon DS6018 */
    val DS6018 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Digidragon DS6261 */
    val DS6261 = "spec:width=480,height=1014,unit=px,dpi=220"

}
