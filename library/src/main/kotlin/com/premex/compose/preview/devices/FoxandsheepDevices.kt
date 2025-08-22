package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Foxandsheep device specifications for Android Compose previews.
 *
 * This extension provides Foxandsheep device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Foxandsheep.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Foxandsheep get() = object {
    /** Foxandsheep Kidstablet1 */
    val KIDSTABLET1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Foxandsheep KidstabletOne */
    val KIDSTABLETONE = "spec:width=600,height=1024,unit=px,dpi=160"

}
