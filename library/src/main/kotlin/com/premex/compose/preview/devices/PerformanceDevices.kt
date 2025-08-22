package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Performance device specifications for Android Compose previews.
 *
 * This extension provides Performance device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Performance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Performance get() = object {
    /** Performance PR7RKTNF */
    val PR7RKTNF = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Performance 	T7 */
    val T7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Performance T9 */
    val T9 = "spec:width=600,height=1024,unit=px,dpi=160"

}
