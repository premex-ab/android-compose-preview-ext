package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aston device specifications for Android Compose previews.
 *
 * This extension provides Aston device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aston.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aston get() = object {
    /** Aston Hyper_Max_Power */
    val HYPER_MAX_POWER = "spec:width=800,height=1280,unit=px,dpi=160"

}
