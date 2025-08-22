package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Valifone device specifications for Android Compose previews.
 *
 * This extension provides Valifone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Valifone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Valifone get() = object {
    /** Valifone V200_EEA */
    val V200_EEA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Valifone V710 */
    val V710 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Valifone V730 */
    val V730 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Valifone W888 */
    val W888 = "spec:width=1080,height=2340,unit=px,dpi=480"

}
