package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pitneybowes device specifications for Android Compose previews.
 *
 * This extension provides Pitneybowes device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pitneybowes.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pitneybowes get() = object {
    /** Pitneybowes SendPro C Series */
    val SENDPRO_C_SERIES = "spec:width=600,height=1024,unit=px,dpi=160"

}
