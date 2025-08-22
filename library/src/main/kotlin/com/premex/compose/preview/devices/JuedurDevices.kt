package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Juedur device specifications for Android Compose previews.
 *
 * This extension provides Juedur device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Juedur.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Juedur get() = object {
    /** Juedur R500 EEA */
    val R500_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Juedur R500 US */
    val R500_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Juedur R700_EEA */
    val R700_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Juedur R700_US */
    val R700_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Juedur R800_U_EEA */
    val R800_U_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Juedur R900_EEA */
    val R900_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Juedur R900_US */
    val R900_US = "spec:width=800,height=1280,unit=px,dpi=213"

}
