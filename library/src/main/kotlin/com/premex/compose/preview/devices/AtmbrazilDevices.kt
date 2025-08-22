package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Atmbrazil device specifications for Android Compose previews.
 *
 * This extension provides Atmbrazil device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Atmbrazil.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Atmbrazil get() = object {
    /** Atmbrazil IT-1001A */
    val IT_1001A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Atmbrazil R5 */
    val R5 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Atmbrazil R5_Pro */
    val R5_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Atmbrazil X50u */
    val X50U = "spec:width=1080,height=2460,unit=px,dpi=480"

}
