package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Huavi device specifications for Android Compose previews.
 *
 * This extension provides Huavi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Huavi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Huavi get() = object {
    /** Huavi KHATAR H-20 PRO */
    val KHATAR_H_20_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Huavi SH_700 */
    val SH_700 = "spec:width=720,height=1600,unit=px,dpi=320"

}
