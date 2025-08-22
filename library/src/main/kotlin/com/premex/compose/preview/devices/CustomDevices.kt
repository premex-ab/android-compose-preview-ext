package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Custom device specifications for Android Compose previews.
 *
 * This extension provides Custom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Custom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Custom get() = object {
    /** Custom Ares */
    val ARES = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Custom K-Ranger */
    val K_RANGER = "spec:width=480,height=800,unit=px,dpi=240"

    /** Custom P-Ranger */
    val P_RANGER = "spec:width=720,height=1280,unit=px,dpi=320"

}
