package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Senraise device specifications for Android Compose previews.
 *
 * This extension provides Senraise device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Senraise.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Senraise get() = object {
    /** Senraise H10_EEA */
    val H10_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

}
