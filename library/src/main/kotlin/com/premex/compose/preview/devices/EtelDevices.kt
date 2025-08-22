package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Etel device specifications for Android Compose previews.
 *
 * This extension provides Etel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Etel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Etel get() = object {
    /** Etel E-tel_i20 */
    val E_TEL_I20 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Etel M4 */
    val M4 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Etel Q7 */
    val Q7 = "spec:width=800,height=1280,unit=px,dpi=213"

}
