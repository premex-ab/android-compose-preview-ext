package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Essentielb device specifications for Android Compose previews.
 *
 * This extension provides Essentielb device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Essentielb.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Essentielb get() = object {
    /** Essentielb SmartTab1007 */
    val SMARTTAB1007 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Essentielb SmartTAB1008 */
    val SMARTTAB1008 = "spec:width=1200,height=1920,unit=px,dpi=213"

}
