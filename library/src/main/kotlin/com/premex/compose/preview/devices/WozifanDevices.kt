package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wozifan device specifications for Android Compose previews.
 *
 * This extension provides Wozifan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wozifan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wozifan get() = object {
    /** Wozifan 3W_EEA */
    val _3W_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Wozifan 3W_US */
    val _3W_US = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Wozifan W10_EEA */
    val W10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Wozifan W10_T_US */
    val W10_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Wozifan W10_US */
    val W10_US = "spec:width=800,height=1280,unit=px,dpi=160"

}
