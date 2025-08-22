package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Red device specifications for Android Compose previews.
 *
 * This extension provides Red device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Red.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Red get() = object {
    /** Red HydrogenONE */
    val HYDROGENONE = "spec:width=1440,height=2560,unit=px,dpi=560"

}
