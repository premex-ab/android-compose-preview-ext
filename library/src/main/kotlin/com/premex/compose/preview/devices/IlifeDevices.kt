package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ilife device specifications for Android Compose previews.
 *
 * This extension provides Ilife device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ilife.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ilife get() = object {
    /** Ilife ITELL_K3102N */
    val ITELL_K3102N = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ilife ITELL_K3500N */
    val ITELL_K3500N = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ilife ITELL_K3800Q */
    val ITELL_K3800Q = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ilife MISA */
    val MISA = "spec:width=800,height=1280,unit=px,dpi=213"

}
