package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Freeski device specifications for Android Compose previews.
 *
 * This extension provides Freeski device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Freeski.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Freeski get() = object {
    /** Freeski C12A */
    val C12A = "spec:width=800,height=1332,unit=px,dpi=160"

}
