package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wssz device specifications for Android Compose previews.
 *
 * This extension provides Wssz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wssz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wssz get() = object {
    /** Wssz TD-TP010G-2 */
    val TD_TP010G_2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Wssz WS-T01 */
    val WS_T01 = "spec:width=800,height=1280,unit=px,dpi=160"

}
