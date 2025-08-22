package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mobiletelesystem device specifications for Android Compose previews.
 *
 * This extension provides Mobiletelesystem device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mobiletelesystem.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mobiletelesystem get() = object {
    /** Mobiletelesystem SMART Race2 4G */
    val SMART_RACE2_4G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Mobiletelesystem SMART_Sprint_4G */
    val SMART_SPRINT_4G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Mobiletelesystem Smart Surf2 4G */
    val SMART_SURF2_4G = "spec:width=720,height=1280,unit=px,dpi=320"

}
