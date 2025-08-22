package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Oase device specifications for Android Compose previews.
 *
 * This extension provides Oase device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Oase.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Oase get() = object {
    /** Oase EL-P1 */
    val EL_P1 = "spec:width=800,height=1280,unit=px,dpi=213"

}
