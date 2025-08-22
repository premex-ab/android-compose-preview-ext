package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Blaupunkt device specifications for Android Compose previews.
 *
 * This extension provides Blaupunkt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Blaupunkt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Blaupunkt get() = object {
    /** Blaupunkt Blaupunkt SL 04 */
    val BLAUPUNKT_SL_04 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Blaupunkt Blaupunkt SM 01 */
    val BLAUPUNKT_SM_01 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blaupunkt Blaupunkt_SM_02 */
    val BLAUPUNKT_SM_02 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blaupunkt BP_6108 */
    val BP_6108 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Blaupunkt BP_6110 */
    val BP_6110 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Blaupunkt BP_T6108X */
    val BP_T6108X = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Blaupunkt BP_T6110X */
    val BP_T6110X = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Blaupunkt Guardian */
    val GUARDIAN = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blaupunkt OT16 */
    val OT16 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Blaupunkt OT19 */
    val OT19 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Blaupunkt  SF02_eea */
    val SF02_EEA = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blaupunkt SF04 4G */
    val SF04_4G = "spec:width=480,height=800,unit=px,dpi=240"

    /** Blaupunkt SL05 */
    val SL05 = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Blaupunkt SM_02_2019 */
    val SM_02_2019 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blaupunkt SM 05 */
    val SM_05 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Blaupunkt TX01 */
    val TX01 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Blaupunkt TX60 */
    val TX60 = "spec:width=720,height=1560,unit=px,dpi=320"

}
