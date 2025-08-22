package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jyonetsukakaku device specifications for Android Compose previews.
 *
 * This extension provides Jyonetsukakaku device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jyonetsukakaku.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jyonetsukakaku get() = object {
    /** Jyonetsukakaku YMR8 */
    val YMR8 = "spec:width=768,height=1024,unit=px,dpi=160"

}
