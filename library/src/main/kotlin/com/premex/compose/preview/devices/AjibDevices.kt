package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ajib device specifications for Android Compose previews.
 *
 * This extension provides Ajib device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ajib.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ajib get() = object {
    /** Ajib ajib_i10 */
    val AJIB_I10 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Ajib ajib l1 */
    val AJIB_L1 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ajib ajib X1 */
    val AJIB_X1 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Ajib i15 */
    val I15 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ajib i25 */
    val I25 = "spec:width=720,height=1600,unit=px,dpi=320"

}
