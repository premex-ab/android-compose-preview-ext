package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Atilimuniversity device specifications for Android Compose previews.
 *
 * This extension provides Atilimuniversity device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Atilimuniversity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Atilimuniversity get() = object {
    /** Atilimuniversity ATILIM_mPAD07 */
    val ATILIM_MPAD07 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
