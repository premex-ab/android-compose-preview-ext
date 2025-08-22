package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tokecy device specifications for Android Compose previews.
 *
 * This extension provides Tokecy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tokecy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tokecy get() = object {
    /** Tokecy T847 */
    val T847 = "spec:width=800,height=1332,unit=px,dpi=160"

    /** Tokecy T847_EEA */
    val T847_EEA = "spec:width=800,height=1332,unit=px,dpi=160"

}
