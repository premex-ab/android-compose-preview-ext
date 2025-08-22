package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Newline device specifications for Android Compose previews.
 *
 * This extension provides Newline device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Newline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Newline get() = object {
    /** Newline 23QA */
    val _23QA = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Newline Q23 */
    val Q23 = "spec:width=2160,height=3840,unit=px,dpi=320"

    /** Newline Z Pro Series */
    val Z_PRO_SERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

}
