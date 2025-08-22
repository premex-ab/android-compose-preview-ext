package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rayomovil device specifications for Android Compose previews.
 *
 * This extension provides Rayomovil device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rayomovil.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rayomovil get() = object {
    /** Rayomovil Atlas */
    val ATLAS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Rayomovil ATLAS 2 */
    val ATLAS_2 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Rayomovil RAYO X1 */
    val RAYO_X1 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Rayomovil X1Plus */
    val X1PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

}
