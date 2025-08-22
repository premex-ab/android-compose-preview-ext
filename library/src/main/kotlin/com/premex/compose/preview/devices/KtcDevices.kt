package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ktc device specifications for Android Compose previews.
 *
 * This extension provides Ktc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ktc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ktc get() = object {
    /** Ktc SD_GM01 */
    val SD_GM01 = "spec:width=2160,height=3840,unit=px,dpi=560"

    /** Ktc SD_GM02 */
    val SD_GM02 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Ktc SD_GM03 */
    val SD_GM03 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Ktc W83B-LANGO3576 */
    val W83B_LANGO3576 = "spec:width=2160,height=3840,unit=px,dpi=480"

}
