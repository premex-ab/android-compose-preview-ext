package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Benco device specifications for Android Compose previews.
 *
 * This extension provides Benco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Benco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Benco get() = object {
    /** Benco AE9110 */
    val AE9110 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Benco AE9230 */
    val AE9230 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Benco AE9240 */
    val AE9240 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Benco AE9250 */
    val AE9250 = "spec:width=480,height=1014,unit=px,dpi=220"

    /** Benco AE9950 */
    val AE9950 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Benco AEOP519 */
    val AEOP519 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Benco AEOP520 */
    val AEOP520 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Benco AF9010_F */
    val AF9010_F = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Benco AF9020 */
    val AF9020 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Benco AF9030 */
    val AF9030 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Benco AH9910 */
    val AH9910 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Benco benco S1 Plus */
    val BENCO_S1_PLUS = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Benco benco S1 Pro */
    val BENCO_S1_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Benco benco S2c */
    val BENCO_S2C = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Benco benco V62 */
    val BENCO_V62 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Benco benco v80 */
    val BENCO_V80 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Benco benco V90 */
    val BENCO_V90 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Benco benco V90i */
    val BENCO_V90I = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Benco benco V91 */
    val BENCO_V91 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Benco benco V92 */
    val BENCO_V92 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Benco benco Y11 */
    val BENCO_Y11 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Benco benco Y40 */
    val BENCO_Y40 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Benco M1000 */
    val M1000 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Benco M700 */
    val M700 = "spec:width=600,height=1024,unit=px,dpi=160"

}
