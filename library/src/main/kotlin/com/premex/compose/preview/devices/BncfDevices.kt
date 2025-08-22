package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bncf device specifications for Android Compose previews.
 *
 * This extension provides Bncf device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bncf.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bncf get() = object {
    /** Bncf BPad */
    val BPAD = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Bncf BPad_10_4G */
    val BPAD_10_4G = "spec:width=1200,height=1920,unit=px,dpi=213"

}
