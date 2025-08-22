package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Azpen device specifications for Android Compose previews.
 *
 * This extension provides Azpen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Azpen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Azpen get() = object {
    /** Azpen A1046G */
    val A1046G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Azpen A1080 */
    val A1080 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Azpen A1080G */
    val A1080G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Azpen A1083 */
    val A1083 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Azpen C-603 */
    val C_603 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Azpen G800 */
    val G800 = "spec:width=800,height=1280,unit=px,dpi=220"

}
