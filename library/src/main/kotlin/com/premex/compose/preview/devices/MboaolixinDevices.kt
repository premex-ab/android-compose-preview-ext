package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mboaolixin device specifications for Android Compose previews.
 *
 * This extension provides Mboaolixin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mboaolixin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mboaolixin get() = object {
    /** Mboaolixin 16A Pro */
    val _16A_PRO = "spec:width=720,height=1612,unit=px,dpi=240"

    /** Mboaolixin 24S_Ultra */
    val _24S_ULTRA = "spec:width=720,height=1612,unit=px,dpi=240"

}
