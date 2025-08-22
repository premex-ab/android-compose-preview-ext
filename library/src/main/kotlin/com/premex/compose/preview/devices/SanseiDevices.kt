package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sansei device specifications for Android Compose previews.
 *
 * This extension provides Sansei device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sansei.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sansei get() = object {
    /** Sansei TS10A1 */
    val TS10A1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Sansei TS7A1 */
    val TS7A1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Sansei TS7K */
    val TS7K = "spec:width=600,height=1024,unit=px,dpi=160"

}
