package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Huskee device specifications for Android Compose previews.
 *
 * This extension provides Huskee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Huskee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Huskee get() = object {
    /** Huskee HELIOS */
    val HELIOS = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Huskee HELIOS_Plus */
    val HELIOS_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Huskee ST-810 */
    val ST_810 = "spec:width=600,height=1024,unit=px,dpi=160"

}
