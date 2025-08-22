package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hotlight device specifications for Android Compose previews.
 *
 * This extension provides Hotlight device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hotlight.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hotlight get() = object {
    /** Hotlight C108_EEA */
    val C108_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hotlight TP1003 */
    val TP1003 = "spec:width=800,height=1280,unit=px,dpi=160"

}
