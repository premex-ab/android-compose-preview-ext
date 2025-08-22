package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tabwee device specifications for Android Compose previews.
 *
 * This extension provides Tabwee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tabwee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tabwee get() = object {
    /** Tabwee T20_NEU */
    val T20_NEU = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Tabwee T90_NEU */
    val T90_NEU = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Tabwee W90_RU */
    val W90_RU = "spec:width=1200,height=1920,unit=px,dpi=280"

}
