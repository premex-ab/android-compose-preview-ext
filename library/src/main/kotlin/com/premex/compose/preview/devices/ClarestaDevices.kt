package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Claresta device specifications for Android Compose previews.
 *
 * This extension provides Claresta device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Claresta.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Claresta get() = object {
    /** Claresta S6Plus */
    val S6PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

}
