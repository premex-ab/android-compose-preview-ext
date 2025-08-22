package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Domaton device specifications for Android Compose previews.
 *
 * This extension provides Domaton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Domaton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Domaton get() = object {
    /** Domaton D102 */
    val D102 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Domaton D718 */
    val D718 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Domaton K111 */
    val K111 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Domaton MID_1099IPS */
    val MID_1099IPS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Domaton Ocean_K10 */
    val OCEAN_K10 = "spec:width=800,height=1280,unit=px,dpi=160"

}
