package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Luoa device specifications for Android Compose previews.
 *
 * This extension provides Luoa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Luoa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Luoa get() = object {
    /** Luoa P70 Pro */
    val P70_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Luoa S15 Pro */
    val S15_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Luoa S16 Pro */
    val S16_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Luoa S17 Pro */
    val S17_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Luoa S18 Max */
    val S18_MAX = "spec:width=720,height=1640,unit=px,dpi=320"

}
