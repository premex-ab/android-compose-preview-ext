package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pepperlfuchs device specifications for Android Compose previews.
 *
 * This extension provides Pepperlfuchs device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pepperlfuchs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pepperlfuchs get() = object {
    /** Pepperlfuchs Smart-Ex 03 */
    val SMART_EX_03 = "spec:width=1080,height=2160,unit=px,dpi=480"

}
