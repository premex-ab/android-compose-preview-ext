package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mosambee device specifications for Android Compose previews.
 *
 * This extension provides Mosambee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mosambee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mosambee get() = object {
    /** Mosambee Qphone2 4110 */
    val QPHONE2_4110 = "spec:width=480,height=960,unit=px,dpi=213"

}
