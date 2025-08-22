package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Brantel device specifications for Android Compose previews.
 *
 * This extension provides Brantel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Brantel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Brantel get() = object {
    /** Brantel E-tel_i10 */
    val E_TEL_I10 = "spec:width=480,height=800,unit=px,dpi=240"

}
