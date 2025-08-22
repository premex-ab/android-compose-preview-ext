package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bolva device specifications for Android Compose previews.
 *
 * This extension provides Bolva device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bolva.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bolva get() = object {
    /** Bolva B_TAB1021 */
    val B_TAB1021 = "spec:width=800,height=1280,unit=px,dpi=160"

}
