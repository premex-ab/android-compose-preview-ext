package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nyxmobile device specifications for Android Compose previews.
 *
 * This extension provides Nyxmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nyxmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nyxmobile get() = object {
    /** Nyxmobile Click */
    val CLICK = "spec:width=480,height=800,unit=px,dpi=240"

    /** Nyxmobile GLAM */
    val GLAM = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nyxmobile KiN */
    val KIN = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Nyxmobile L604 */
    val L604 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Nyxmobile REX */
    val REX = "spec:width=480,height=854,unit=px,dpi=240"

    /** Nyxmobile SHADE */
    val SHADE = "spec:width=480,height=854,unit=px,dpi=240"

}
