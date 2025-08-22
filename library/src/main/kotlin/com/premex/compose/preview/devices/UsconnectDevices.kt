package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Usconnect device specifications for Android Compose previews.
 *
 * This extension provides Usconnect device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Usconnect.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Usconnect get() = object {
    /** Usconnect VT10M2 */
    val VT10M2 = "spec:width=800,height=1280,unit=px,dpi=160"

}
