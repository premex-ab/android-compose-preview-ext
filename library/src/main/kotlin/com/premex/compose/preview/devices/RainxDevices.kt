package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rainx device specifications for Android Compose previews.
 *
 * This extension provides Rainx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rainx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rainx get() = object {
    /** Rainx the101loop */
    val THE101LOOP = "spec:width=1080,height=1920,unit=px,dpi=400"

}
