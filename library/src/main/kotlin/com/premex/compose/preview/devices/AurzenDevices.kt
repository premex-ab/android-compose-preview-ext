package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aurzen device specifications for Android Compose previews.
 *
 * This extension provides Aurzen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aurzen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aurzen get() = object {
    /** Aurzen TB-AS100A */
    val TB_AS100A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Aurzen TB-AS110A */
    val TB_AS110A = "spec:width=1200,height=2000,unit=px,dpi=240"

}
