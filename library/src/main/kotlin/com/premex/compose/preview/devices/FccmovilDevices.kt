package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fccmovil device specifications for Android Compose previews.
 *
 * This extension provides Fccmovil device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fccmovil.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fccmovil get() = object {
    /** Fccmovil GK738_3G */
    val GK738_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Fccmovil GK788 */
    val GK788 = "spec:width=600,height=1024,unit=px,dpi=160"

}
