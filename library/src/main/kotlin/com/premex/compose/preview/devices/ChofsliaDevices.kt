package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Chofslia device specifications for Android Compose previews.
 *
 * This extension provides Chofslia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Chofslia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Chofslia get() = object {
    /** Chofslia A6_EEA */
    val A6_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
