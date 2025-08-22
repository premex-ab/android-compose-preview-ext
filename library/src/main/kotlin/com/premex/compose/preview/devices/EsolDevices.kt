package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Esol device specifications for Android Compose previews.
 *
 * This extension provides Esol device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Esol.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Esol get() = object {
    /** Esol ESOL_Board */
    val ESOL_BOARD = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Esol HCB_52series */
    val HCB_52SERIES = "spec:width=2160,height=3840,unit=px,dpi=640"

}
