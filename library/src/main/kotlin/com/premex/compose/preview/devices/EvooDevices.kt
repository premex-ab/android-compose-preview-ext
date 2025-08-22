package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Evoo device specifications for Android Compose previews.
 *
 * This extension provides Evoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Evoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Evoo get() = object {
    /** Evoo EV-A-101-3 */
    val EV_A_101_3 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Evoo EV-A-116-1 */
    val EV_A_116_1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Evoo EV-A-133-1 */
    val EV_A_133_1 = "spec:width=1080,height=1920,unit=px,dpi=213"

    /** Evoo EV-A-156-1 */
    val EV_A_156_1 = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Evoo EVMFV2 */
    val EVMFV2 = "spec:width=720,height=1440,unit=px,dpi=320"

}
