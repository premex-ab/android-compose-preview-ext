package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gaseisa device specifications for Android Compose previews.
 *
 * This extension provides Gaseisa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gaseisa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gaseisa get() = object {
    /** Gaseisa SENSE701 */
    val SENSE701 = "spec:width=600,height=1024,unit=px,dpi=160"

}
