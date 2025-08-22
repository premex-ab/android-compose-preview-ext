package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ujoyfeel device specifications for Android Compose previews.
 *
 * This extension provides Ujoyfeel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ujoyfeel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ujoyfeel get() = object {
    /** Ujoyfeel KIDS705-701A */
    val KIDS705_701A = "spec:width=600,height=1024,unit=px,dpi=160"

}
