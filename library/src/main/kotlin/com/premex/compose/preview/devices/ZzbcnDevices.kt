package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zzbcn device specifications for Android Compose previews.
 *
 * This extension provides Zzbcn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zzbcn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zzbcn get() = object {
    /** Zzbcn ZB10 */
    val ZB10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Zzbcn ZB10M */
    val ZB10M = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Zzbcn ZB40 */
    val ZB40 = "spec:width=800,height=1280,unit=px,dpi=160"

}
