package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Qelectronics device specifications for Android Compose previews.
 *
 * This extension provides Qelectronics device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Qelectronics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Qelectronics get() = object {
    /** Qelectronics QP-TAQC70 */
    val QP_TAQC70 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Qelectronics QP-TAQC80 */
    val QP_TAQC80 = "spec:width=800,height=1280,unit=px,dpi=160"

}
