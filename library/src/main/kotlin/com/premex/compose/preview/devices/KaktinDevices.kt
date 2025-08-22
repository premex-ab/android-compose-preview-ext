package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kaktin device specifications for Android Compose previews.
 *
 * This extension provides Kaktin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kaktin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kaktin get() = object {
    /** Kaktin SM1 */
    val SM1 = "spec:width=800,height=1280,unit=px,dpi=160"

}
