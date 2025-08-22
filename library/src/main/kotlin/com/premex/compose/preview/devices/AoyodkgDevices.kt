package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aoyodkg device specifications for Android Compose previews.
 *
 * This extension provides Aoyodkg device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aoyodkg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aoyodkg get() = object {
    /** Aoyodkg M50 */
    val M50 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aoyodkg M50_EEA */
    val M50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
