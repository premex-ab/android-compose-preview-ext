package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xgody device specifications for Android Compose previews.
 *
 * This extension provides Xgody device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xgody.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xgody get() = object {
    /** Xgody Mate_70_EEA */
    val MATE_70_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Xgody N02 */
    val N02 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xgody N02_A */
    val N02_A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xgody N02_ProA */
    val N02_PROA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xgody P60Pro */
    val P60PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Xgody P60pro_15 */
    val P60PRO_15 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Xgody Q16 */
    val Q16 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xgody Q17 */
    val Q17 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xgody R15_EEA */
    val R15_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Xgody T702 */
    val T702 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xgody T702E_EEA */
    val T702E_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xgody T702Pro */
    val T702PRO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xgody T702Pro_S */
    val T702PRO_S = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xgody TAB10 */
    val TAB10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xgody TAB_M10 */
    val TAB_M10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Xgody TAB_M10_EEA */
    val TAB_M10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Xgody X32_EEA */
    val X32_EEA = "spec:width=480,height=960,unit=px,dpi=213"

    /** Xgody XGT_EEA */
    val XGT_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

}
