package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Owxmobile device specifications for Android Compose previews.
 *
 * This extension provides Owxmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Owxmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Owxmobile get() = object {
    /** Owxmobile W50s */
    val W50S = "spec:width=480,height=960,unit=px,dpi=200"

}
