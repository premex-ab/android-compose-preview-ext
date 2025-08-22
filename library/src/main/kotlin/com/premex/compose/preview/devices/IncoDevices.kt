package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Inco device specifications for Android Compose previews.
 *
 * This extension provides Inco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Inco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Inco get() = object {
    /** Inco eco_s */
    val ECO_S = "spec:width=480,height=800,unit=px,dpi=240"

    /** Inco Horizon + */
    val HORIZON = "spec:width=480,height=996,unit=px,dpi=240"

    /** Inco Horizon_S */
    val HORIZON_S = "spec:width=720,height=1520,unit=px,dpi=320"

}
