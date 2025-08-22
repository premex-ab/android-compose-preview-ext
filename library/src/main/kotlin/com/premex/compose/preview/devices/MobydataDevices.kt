package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mobydata device specifications for Android Compose previews.
 *
 * This extension provides Mobydata device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mobydata.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mobydata get() = object {
    /** Mobydata m63 */
    val M63 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Mobydata M72 */
    val M72 = "spec:width=480,height=800,unit=px,dpi=240"

}
