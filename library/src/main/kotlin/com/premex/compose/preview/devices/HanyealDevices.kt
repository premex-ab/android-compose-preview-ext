package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hanyeal device specifications for Android Compose previews.
 *
 * This extension provides Hanyeal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hanyeal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hanyeal get() = object {
    /** Hanyeal E101GC */
    val E101GC = "spec:width=800,height=1280,unit=px,dpi=160"

}
