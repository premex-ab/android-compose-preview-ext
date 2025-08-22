package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Spectrageospatial device specifications for Android Compose previews.
 *
 * This extension provides Spectrageospatial device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Spectrageospatial.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Spectrageospatial get() = object {
    /** Spectrageospatial MobileMapper60_2 */
    val MOBILEMAPPER60_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Spectrageospatial Ranger 5 */
    val RANGER_5 = "spec:width=720,height=1280,unit=px,dpi=320"

}
