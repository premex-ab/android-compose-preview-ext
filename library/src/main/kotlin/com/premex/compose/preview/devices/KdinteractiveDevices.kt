package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kdinteractive device specifications for Android Compose previews.
 *
 * This extension provides Kdinteractive device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kdinteractive.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kdinteractive get() = object {
    /** Kdinteractive C15100m */
    val C15100M = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Kdinteractive TAB3-Premium-XTREME3 */
    val TAB3_PREMIUM_XTREME3 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Kdinteractive TabXL-Smart-Smart2in1-Tab10 */
    val TABXL_SMART_SMART2IN1_TAB10 = "spec:width=800,height=1280,unit=px,dpi=160"

}
