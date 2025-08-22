package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Philcoar device specifications for Android Compose previews.
 *
 * This extension provides Philcoar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Philcoar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Philcoar get() = object {
    /** Philcoar P510 */
    val P510 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Philcoar P610 */
    val P610 = "spec:width=480,height=960,unit=px,dpi=220"

}
