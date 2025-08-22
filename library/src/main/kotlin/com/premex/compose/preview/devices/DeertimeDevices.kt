package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Deertime device specifications for Android Compose previews.
 *
 * This extension provides Deertime device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Deertime.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Deertime get() = object {
    /** Deertime  E10_EEA  */
    val E10_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Deertime E15_EEA */
    val E15_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Deertime E15_US */
    val E15_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Deertime E6_EEA */
    val E6_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Deertime E6_US */
    val E6_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Deertime E9_EEA */
    val E9_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Deertime E9_US */
    val E9_US = "spec:width=800,height=1280,unit=px,dpi=160"

}
