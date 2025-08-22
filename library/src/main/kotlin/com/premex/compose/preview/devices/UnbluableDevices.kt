package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Unbluable device specifications for Android Compose previews.
 *
 * This extension provides Unbluable device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Unbluable.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Unbluable get() = object {
    /** Unbluable T7E */
    val T7E = "spec:width=768,height=1024,unit=px,dpi=160"

}
