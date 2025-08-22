package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sqmax device specifications for Android Compose previews.
 *
 * This extension provides Sqmax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sqmax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sqmax get() = object {
    /** Sqmax Hope10_Max */
    val HOPE10_MAX = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Sqmax Hope8_Max */
    val HOPE8_MAX = "spec:width=800,height=1280,unit=px,dpi=204"

}
