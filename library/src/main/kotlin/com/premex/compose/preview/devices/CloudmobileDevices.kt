package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cloudmobile device specifications for Android Compose previews.
 *
 * This extension provides Cloudmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cloudmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cloudmobile get() = object {
    /** Cloudmobile Stratus_C8 */
    val STRATUS_C8 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Cloudmobile Sunshine_T2_Elite */
    val SUNSHINE_T2_ELITE = "spec:width=800,height=1280,unit=px,dpi=213"

}
