package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Yestel device specifications for Android Compose previews.
 *
 * This extension provides Yestel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Yestel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Yestel get() = object {
    /** Yestel Note_30_pro */
    val NOTE_30_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Yestel T13_EEA */
    val T13_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Yestel T13_T_EEA */
    val T13_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Yestel T13_US */
    val T13_US = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Yestel T15_EEA */
    val T15_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Yestel T15_US */
    val T15_US = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Yestel T5 */
    val T5 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Yestel T5_0 */
    val T5_0 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Yestel T5_EEA */
    val T5_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Yestel T5_EEA */
    val T5_EEA_800X1280 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Yestel T5_EEA_0 */
    val T5_EEA_0 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Yestel T5-plus */
    val T5_PLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Yestel X2_EEA */
    val X2_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Yestel X2_T_EEA */
    val X2_T_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Yestel X2_T_US */
    val X2_T_US = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Yestel X2_US */
    val X2_US = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Yestel X3_EEA */
    val X3_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Yestel X7_EEA */
    val X7_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Yestel X9_EEA */
    val X9_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Yestel X9_US */
    val X9_US = "spec:width=800,height=1280,unit=px,dpi=213"

}
