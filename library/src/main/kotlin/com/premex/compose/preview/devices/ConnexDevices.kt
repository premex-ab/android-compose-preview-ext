package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Connex device specifications for Android Compose previews.
 *
 * This extension provides Connex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Connex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Connex get() = object {
    /** Connex CTAB-1044 */
    val CTAB_1044 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Connex CTAB1044hn */
    val CTAB1044HN = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Connex SEN_1055_ARM1064 */
    val SEN_1055_ARM1064 = "spec:width=800,height=1280,unit=px,dpi=160"

}
