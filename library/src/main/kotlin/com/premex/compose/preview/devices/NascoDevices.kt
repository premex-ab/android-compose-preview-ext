package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nasco device specifications for Android Compose previews.
 *
 * This extension provides Nasco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nasco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nasco get() = object {
    /** Nasco Hero */
    val HERO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Nasco Magic-s */
    val MAGIC_S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Nasco Power Plus */
    val POWER_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nasco Warrior */
    val WARRIOR = "spec:width=480,height=800,unit=px,dpi=240"

}
