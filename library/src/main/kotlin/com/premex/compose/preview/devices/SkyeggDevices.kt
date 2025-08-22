package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Skyegg device specifications for Android Compose previews.
 *
 * This extension provides Skyegg device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Skyegg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Skyegg get() = object {
    /** Skyegg K11_EEA */
    val K11_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Skyegg K11_US */
    val K11_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Skyegg K13_EEA */
    val K13_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Skyegg K13_US */
    val K13_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Skyegg K15_EEA */
    val K15_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Skyegg K15_US */
    val K15_US = "spec:width=800,height=1280,unit=px,dpi=160"

}
