package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Warnerbros device specifications for Android Compose previews.
 *
 * This extension provides Warnerbros device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Warnerbros.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Warnerbros get() = object {
    /** Warnerbros Avengers */
    val AVENGERS = "spec:width=600,height=1024,unit=px,dpi=160"

}
