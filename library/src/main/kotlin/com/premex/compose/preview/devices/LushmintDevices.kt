package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lushmint device specifications for Android Compose previews.
 *
 * This extension provides Lushmint device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lushmint.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lushmint get() = object {
    /** Lushmint LM5314G */
    val LM5314G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Lushmint LM5514G */
    val LM5514G = "spec:width=480,height=960,unit=px,dpi=213"

}
