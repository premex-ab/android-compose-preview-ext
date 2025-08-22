package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Serenity device specifications for Android Compose previews.
 *
 * This extension provides Serenity device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Serenity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Serenity get() = object {
    /** Serenity BE109 */
    val BE109 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
