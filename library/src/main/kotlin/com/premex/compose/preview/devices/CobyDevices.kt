package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Coby device specifications for Android Compose previews.
 *
 * This extension provides Coby device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Coby.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Coby get() = object {
    /** Coby Dorado */
    val DORADO = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Coby MID7052 */
    val MID7052 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Coby MID8072 */
    val MID8072 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Coby MID-CBY1108 */
    val MID_CBY1108 = "spec:width=800,height=1280,unit=px,dpi=160"

}
