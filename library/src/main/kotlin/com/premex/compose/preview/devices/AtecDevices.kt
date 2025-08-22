package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Atec device specifications for Android Compose previews.
 *
 * This extension provides Atec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Atec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Atec get() = object {
    /** Atec APD3 */
    val APD3 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Atec ATEC GRANDE */
    val ATEC_GRANDE = "spec:width=2160,height=3840,unit=px,dpi=420"

}
