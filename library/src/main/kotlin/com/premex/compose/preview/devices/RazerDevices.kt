package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Razer device specifications for Android Compose previews.
 *
 * This extension provides Razer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Razer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Razer get() = object {
    /** Razer Phone 2 */
    val PHONE_2 = "spec:width=1440,height=2560,unit=px,dpi=480"

    /** Razer Razer Edge */
    val RAZER_EDGE = "spec:width=1080,height=2400,unit=px,dpi=360"

    /** Razer Razer Edge 5G */
    val RAZER_EDGE_5G = "spec:width=1080,height=2400,unit=px,dpi=360"

    /** Razer Razer phone */
    val RAZER_PHONE = "spec:width=1440,height=2560,unit=px,dpi=480"

}
