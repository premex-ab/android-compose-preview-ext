package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hanasis device specifications for Android Compose previews.
 *
 * This extension provides Hanasis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hanasis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hanasis get() = object {
    /** Hanasis BLAZE */
    val BLAZE = "spec:width=1080,height=1920,unit=px,dpi=160"

}
