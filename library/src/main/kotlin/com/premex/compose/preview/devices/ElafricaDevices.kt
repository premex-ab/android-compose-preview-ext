package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Elafrica device specifications for Android Compose previews.
 *
 * This extension provides Elafrica device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Elafrica.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Elafrica get() = object {
    /** Elafrica D58 */
    val D58 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Elafrica D60_Pro */
    val D60_PRO = "spec:width=600,height=1280,unit=px,dpi=315"

    /** Elafrica D68 */
    val D68 = "spec:width=720,height=1560,unit=px,dpi=380"

    /** Elafrica X60 Pro */
    val X60_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Elafrica X70 */
    val X70 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Elafrica X80 */
    val X80 = "spec:width=720,height=1640,unit=px,dpi=280"

}
