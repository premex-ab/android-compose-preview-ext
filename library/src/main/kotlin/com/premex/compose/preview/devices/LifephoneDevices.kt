package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lifephone device specifications for Android Compose previews.
 *
 * This extension provides Lifephone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lifephone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lifephone get() = object {
    /** Lifephone HERO */
    val HERO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Lifephone IDOL */
    val IDOL = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Lifephone STAR */
    val STAR = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Lifephone VISION */
    val VISION = "spec:width=1080,height=2400,unit=px,dpi=480"

}
