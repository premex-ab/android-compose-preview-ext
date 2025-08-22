package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Meanit device specifications for Android Compose previews.
 *
 * This extension provides Meanit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Meanit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Meanit get() = object {
    /** Meanit K17 */
    val K17 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Meanit meanIT_C10C11 */
    val MEANIT_C10C11 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Meanit meanIT_K20 */
    val MEANIT_K20 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Meanit  meanit_K28_EEA  */
    val MEANIT_K28_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Meanit meanIT_X1 */
    val MEANIT_X1 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Meanit meanIT-X10 */
    val MEANIT_X10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Meanit meanIT_X20 */
    val MEANIT_X20 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Meanit meanIT X4 */
    val MEANIT_X4 = "spec:width=480,height=1014,unit=px,dpi=240"

    /** Meanit meanIT_X40 */
    val MEANIT_X40 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Meanit meanit_X50_EEA */
    val MEANIT_X50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Meanit meanIT_X6 */
    val MEANIT_X6 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Meanit MTAB32_EEA */
    val MTAB32_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Meanit START_S5 */
    val START_S5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Meanit X3 */
    val X3 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Meanit X5 */
    val X5 = "spec:width=720,height=1600,unit=px,dpi=320"

}
