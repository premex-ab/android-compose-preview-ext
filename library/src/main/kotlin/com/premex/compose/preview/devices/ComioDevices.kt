package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Comio device specifications for Android Compose previews.
 *
 * This extension provides Comio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Comio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Comio get() = object {
    /** Comio COMIO C1 */
    val COMIO_C1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Comio COMIO C1 Pro */
    val COMIO_C1_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Comio COMIO C2 */
    val COMIO_C2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Comio COMIO C2 Lite */
    val COMIO_C2_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Comio COMIO P1 */
    val COMIO_P1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Comio COMIO S1 */
    val COMIO_S1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Comio COMIO S1 Lite */
    val COMIO_S1_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Comio COMIO X1 */
    val COMIO_X1 = "spec:width=720,height=1440,unit=px,dpi=320"

}
