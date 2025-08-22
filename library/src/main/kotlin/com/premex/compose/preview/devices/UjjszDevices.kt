package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ujjsz device specifications for Android Compose previews.
 *
 * This extension provides Ujjsz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ujjsz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ujjsz get() = object {
    /** Ujjsz U3_EEA */
    val U3_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ujjsz U3_US */
    val U3_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ujjsz U6_EEA */
    val U6_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ujjsz U6_US */
    val U6_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ujjsz U7_EEA */
    val U7_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ujjsz U7_US */
    val U7_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ujjsz U8_EEA */
    val U8_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ujjsz U8_US */
    val U8_US = "spec:width=800,height=1280,unit=px,dpi=160"

}
