package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Telcel device specifications for Android Compose previews.
 *
 * This extension provides Telcel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Telcel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Telcel get() = object {
    /** Telcel i50F */
    val I50F = "spec:width=480,height=854,unit=px,dpi=240"

}
