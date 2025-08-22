package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kult device specifications for Android Compose previews.
 *
 * This extension provides Kult device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kult.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kult get() = object {
    /** Kult KT05 */
    val KT05 = "spec:width=720,height=1440,unit=px,dpi=320"

}
