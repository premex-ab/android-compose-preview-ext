package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tele2 device specifications for Android Compose previews.
 *
 * This extension provides Tele2 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tele2.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tele2 get() = object {
    /** Tele2 Maxi */
    val MAXI = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Tele2 Maxi_Plus */
    val MAXI_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Tele2 Mini */
    val MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Tele2 Tele2_Midi_2_0 */
    val TELE2_MIDI_2_0 = "spec:width=480,height=854,unit=px,dpi=240"

}
