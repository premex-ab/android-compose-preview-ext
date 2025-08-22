package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Verifone device specifications for Android Compose previews.
 *
 * This extension provides Verifone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Verifone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Verifone get() = object {
    /** Verifone IX90_CQA1103_EEA */
    val IX90_CQA1103_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
