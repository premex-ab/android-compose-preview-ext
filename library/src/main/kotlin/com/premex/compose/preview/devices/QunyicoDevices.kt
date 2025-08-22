package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Qunyico device specifications for Android Compose previews.
 *
 * This extension provides Qunyico device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Qunyico.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Qunyico get() = object {
    /** Qunyico Y10 */
    val Y10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Qunyico Y10_1 */
    val Y10_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Qunyico Y10_EEA */
    val Y10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Qunyico Y7 */
    val Y7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Qunyico Y7_EEA */
    val Y7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

}
