package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Keyence device specifications for Android Compose previews.
 *
 * This extension provides Keyence device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Keyence.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Keyence get() = object {
    /** Keyence BT-A2000 */
    val BT_A2000 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Keyence BT-A600 */
    val BT_A600 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Keyence BTA700 */
    val BTA700 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Keyence DX-A400 */
    val DX_A400 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Keyence DX-A600 */
    val DX_A600 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Keyence DXA800 */
    val DXA800 = "spec:width=1080,height=2160,unit=px,dpi=480"

}
