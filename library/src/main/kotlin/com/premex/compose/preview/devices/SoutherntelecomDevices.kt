package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Southerntelecom device specifications for Android Compose previews.
 *
 * This extension provides Southerntelecom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Southerntelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Southerntelecom get() = object {
    /** Southerntelecom A1000/P1003/P1010 */
    val A1000_P1003_P1010 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Southerntelecom Polaroid L10/P1000 */
    val POLAROID_L10_P1000 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Southerntelecom ST1009 */
    val ST1009 = "spec:width=800,height=1280,unit=px,dpi=160"

}
