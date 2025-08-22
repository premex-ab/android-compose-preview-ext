package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Atmpc device specifications for Android Compose previews.
 *
 * This extension provides Atmpc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Atmpc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Atmpc get() = object {
    /** Atmpc A9_EEA */
    val A9_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Atmpc IT-701A */
    val IT_701A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Atmpc IT_701A1 */
    val IT_701A1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Atmpc IT-801B */
    val IT_801B = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Atmpc IT-801BA3_EEA */
    val IT_801BA3_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
