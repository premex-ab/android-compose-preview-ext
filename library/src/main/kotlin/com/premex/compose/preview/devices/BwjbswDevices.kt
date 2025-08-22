package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bwjbsw device specifications for Android Compose previews.
 *
 * This extension provides Bwjbsw device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bwjbsw.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bwjbsw get() = object {
    /** Bwjbsw KT802_US */
    val KT802_US = "spec:width=800,height=1280,unit=px,dpi=213"

}
