package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Neoniq device specifications for Android Compose previews.
 *
 * This extension provides Neoniq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Neoniq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Neoniq get() = object {
    /** Neoniq NQT-1013GIQ */
    val NQT_1013GIQ = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Neoniq NQT-1014GIQ */
    val NQT_1014GIQ = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Neoniq NQT-1014GIQA */
    val NQT_1014GIQA = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Neoniq NQT-73GIQ */
    val NQT_73GIQ = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Neoniq NQT-73GIQ11 */
    val NQT_73GIQ11 = "spec:width=600,height=1024,unit=px,dpi=160"

}
