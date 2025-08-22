package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Carrozzeria device specifications for Android Compose previews.
 *
 * This extension provides Carrozzeria device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Carrozzeria.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Carrozzeria get() = object {
    /** Carrozzeria SDA-700TAB */
    val SDA_700TAB = "spec:width=800,height=1280,unit=px,dpi=213"

}
