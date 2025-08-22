package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pioneer device specifications for Android Compose previews.
 *
 * This extension provides Pioneer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pioneer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pioneer get() = object {
    /** Pioneer SDA-80TAB */
    val SDA_80TAB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pioneer SDA-835TAB */
    val SDA_835TAB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pioneer SDA-8TAB */
    val SDA_8TAB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pioneer XDP-100R */
    val XDP_100R = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Pioneer XDP-300R */
    val XDP_300R = "spec:width=720,height=1280,unit=px,dpi=320"

}
