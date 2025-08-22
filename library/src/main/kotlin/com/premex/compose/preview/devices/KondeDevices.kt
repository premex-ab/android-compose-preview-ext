package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Konde device specifications for Android Compose previews.
 *
 * This extension provides Konde device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Konde.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Konde get() = object {
    /** Konde KIDS_FIVE */
    val KIDS_FIVE = "spec:width=600,height=1024,unit=px,dpi=160"

}
