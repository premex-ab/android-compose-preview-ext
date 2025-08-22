package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Qbell device specifications for Android Compose previews.
 *
 * This extension provides Qbell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Qbell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Qbell get() = object {
    /** Qbell QPHONE_10_1 */
    val QPHONE_10_1 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Qbell QTAB10 */
    val QTAB10 = "spec:width=800,height=1280,unit=px,dpi=213"

}
