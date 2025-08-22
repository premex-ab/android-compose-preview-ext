package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Shift device specifications for Android Compose previews.
 *
 * This extension provides Shift device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Shift.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Shift get() = object {
    /** Shift SHIFT6m */
    val SHIFT6M = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Shift SHIFT6mq */
    val SHIFT6MQ = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Shift SHIFTphone 8 */
    val SHIFTPHONE_8 = "spec:width=1080,height=2400,unit=px,dpi=420"

}
