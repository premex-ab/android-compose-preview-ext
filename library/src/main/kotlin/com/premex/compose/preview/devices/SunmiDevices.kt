package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sunmi device specifications for Android Compose previews.
 *
 * This extension provides Sunmi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sunmi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sunmi get() = object {
    /** Sunmi D3 MINI */
    val D3_MINI = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sunmi D3 PRO */
    val D3_PRO = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Sunmi K2 */
    val K2 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Sunmi L2s_PRO */
    val L2S_PRO = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Sunmi Sunmi L2H */
    val SUNMI_L2H = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sunmi Sunmi L2Ks */
    val SUNMI_L2KS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Sunmi Sunmi V2s */
    val SUNMI_V2S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sunmi T3 PRO */
    val T3_PRO = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Sunmi V2sNC */
    val V2SNC = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Sunmi V2sPLUS */
    val V2SPLUS = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Sunmi V3 */
    val V3 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sunmi V3 MIX */
    val V3_MIX = "spec:width=800,height=1280,unit=px,dpi=160"

}
