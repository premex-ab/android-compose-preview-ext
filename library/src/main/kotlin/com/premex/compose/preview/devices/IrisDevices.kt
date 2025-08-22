package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iris device specifications for Android Compose previews.
 *
 * This extension provides Iris device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iris.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iris get() = object {
    /** Iris G7060 */
    val G7060 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Iris G7100 */
    val G7100 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Iris G8060 */
    val G8060 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iris IS2PLUS */
    val IS2PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Iris IS2S */
    val IS2S = "spec:width=480,height=854,unit=px,dpi=240"

    /** Iris IS6Plus */
    val IS6PLUS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Iris N30 */
    val N30 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Iris NEXT P+ */
    val NEXT_P = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Iris NEXT P */
    val NEXT_P_720X1280 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Iris Next_P_PRO */
    val NEXT_P_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Iris NEXT U */
    val NEXT_U = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Iris V10 */
    val V10 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Iris V50 */
    val V50 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Iris VOX  4s */
    val VOX_4S = "spec:width=480,height=854,unit=px,dpi=240"

    /** Iris Vox_5S */
    val VOX_5S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Iris VOX Alpha */
    val VOX_ALPHA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Iris VOX Alpha Plus */
    val VOX_ALPHA_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Iris VOX  Energy */
    val VOX_ENERGY = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Iris VOX POP plus */
    val VOX_POP_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Iris VOX POP Pro */
    val VOX_POP_PRO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Iris VOX  STEEL Plus */
    val VOX_STEEL_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

}
