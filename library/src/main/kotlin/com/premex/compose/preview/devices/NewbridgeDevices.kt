package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Newbridge device specifications for Android Compose previews.
 *
 * This extension provides Newbridge device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Newbridge.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Newbridge get() = object {
    /** Newbridge NBTB101 */
    val NBTB101 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Newbridge NBTB101b */
    val NBTB101B = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Newbridge NBTB102 */
    val NBTB102 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
