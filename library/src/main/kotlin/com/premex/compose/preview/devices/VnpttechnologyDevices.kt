package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vnpttechnology device specifications for Android Compose previews.
 *
 * This extension provides Vnpttechnology device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vnpttechnology.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vnpttechnology get() = object {
    /** Vnpttechnology VNPTTechnology */
    val VNPTTECHNOLOGY = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Vnpttechnology VNT_Tab8 */
    val VNT_TAB8 = "spec:width=800,height=1280,unit=px,dpi=213"

}
