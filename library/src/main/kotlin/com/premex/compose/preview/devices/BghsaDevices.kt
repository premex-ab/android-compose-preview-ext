package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bghsa device specifications for Android Compose previews.
 *
 * This extension provides Bghsa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bghsa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bghsa get() = object {
    /** Bghsa BGH Joy 303 */
    val BGH_JOY_303 = "spec:width=480,height=854,unit=px,dpi=240"

}
