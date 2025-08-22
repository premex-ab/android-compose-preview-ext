package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Landrover device specifications for Android Compose previews.
 *
 * This extension provides Landrover device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Landrover.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Landrover get() = object {
    /** Landrover Explore */
    val EXPLORE = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Landrover Land Rover Explore R */
    val LAND_ROVER_EXPLORE_R = "spec:width=720,height=1440,unit=px,dpi=280"

}
