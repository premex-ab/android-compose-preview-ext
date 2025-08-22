package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Satewave device specifications for Android Compose previews.
 *
 * This extension provides Satewave device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Satewave.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Satewave get() = object {
    /** Satewave HPAD-IP8045 */
    val HPAD_IP8045 = "spec:width=800,height=1280,unit=px,dpi=213"

}
