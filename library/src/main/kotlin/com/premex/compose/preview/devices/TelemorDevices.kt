package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Telemor device specifications for Android Compose previews.
 *
 * This extension provides Telemor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Telemor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Telemor get() = object {
    /** Telemor T9503 */
    val T9503 = "spec:width=480,height=854,unit=px,dpi=240"

}
