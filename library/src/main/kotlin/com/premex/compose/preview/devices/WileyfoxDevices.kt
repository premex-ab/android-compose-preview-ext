package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wileyfox device specifications for Android Compose previews.
 *
 * This extension provides Wileyfox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wileyfox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wileyfox get() = object {
    /** Wileyfox Spark Add-X */
    val SPARK_ADD_X = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wileyfox Spark X */
    val SPARK_X = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wileyfox Swift */
    val SWIFT = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Wileyfox Swift 2 */
    val SWIFT_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
