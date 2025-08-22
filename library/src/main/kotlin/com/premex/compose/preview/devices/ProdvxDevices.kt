package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Prodvx device specifications for Android Compose previews.
 *
 * This extension provides Prodvx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Prodvx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Prodvx get() = object {
    /** Prodvx APPC-10SLBe */
    val APPC_10SLBE = "spec:width=800,height=1280,unit=px,dpi=160"

}
