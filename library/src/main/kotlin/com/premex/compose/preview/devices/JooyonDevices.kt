package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jooyon device specifications for Android Compose previews.
 *
 * This extension provides Jooyon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jooyon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jooyon get() = object {
    /** Jooyon J110A */
    val J110A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Jooyon Q27CMA11 */
    val Q27CMA11 = "spec:width=1440,height=2560,unit=px,dpi=240"

}
