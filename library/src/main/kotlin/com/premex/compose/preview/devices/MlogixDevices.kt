package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mlogix device specifications for Android Compose previews.
 *
 * This extension provides Mlogix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mlogix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mlogix get() = object {
    /** Mlogix 10ML_012G */
    val _10ML_012G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mlogix 8ML_08G */
    val _8ML_08G = "spec:width=800,height=1280,unit=px,dpi=160"

}
