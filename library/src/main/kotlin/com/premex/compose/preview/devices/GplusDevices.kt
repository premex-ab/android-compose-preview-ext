package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gplus device specifications for Android Compose previews.
 *
 * This extension provides Gplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gplus get() = object {
    /** Gplus FW6950 */
    val FW6950 = "spec:width=720,height=1280,unit=px,dpi=213"

    /** Gplus GNE-N001S */
    val GNE_N001S = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Gplus GNE_N003S */
    val GNE_N003S = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Gplus Gplus */
    val GPLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gplus Gplus */
    val GPLUS_720X1520 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Gplus GPLUS_A2_Plus */
    val GPLUS_A2_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Gplus P10 */
    val P10 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Gplus P10 2022 */
    val P10_2022 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Gplus S10 */
    val S10 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Gplus X10 */
    val X10 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Gplus Z10 */
    val Z10 = "spec:width=720,height=1600,unit=px,dpi=320"

}
