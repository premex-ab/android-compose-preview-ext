package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Att device specifications for Android Compose previews.
 *
 * This extension provides Att device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Att.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Att get() = object {
    /** Att 9020A */
    val _9020A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Att AT&T Calypso® 4 */
    val AT_T_CALYPSO_4 = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Att AT&T Maestro™ Plus */
    val AT_T_MAESTRO_PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Att AT&T Motivate™ 2 */
    val AT_T_MOTIVATE_2 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Att AT&T Motivate® Pro 5G */
    val AT_T_MOTIVATE_PRO_5G = "spec:width=720,height=1600,unit=px,dpi=260"

    /** Att AT&T Propel™ 5G */
    val AT_T_PROPEL_5G = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Att AT&T RADIANT™ Max 5G */
    val AT_T_RADIANT_MAX_5G = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Att AT&T Verge™ */
    val AT_T_VERGE = "spec:width=720,height=1600,unit=px,dpi=260"

    /** Att Pelican */
    val PELICAN = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Att QS5509A */
    val QS5509A = "spec:width=480,height=854,unit=px,dpi=240"

    /** Att  U202AA  */
    val U202AA = "spec:width=480,height=960,unit=px,dpi=213"

    /** Att U304AA */
    val U304AA = "spec:width=480,height=960,unit=px,dpi=213"

    /** Att U318AA */
    val U318AA = "spec:width=480,height=960,unit=px,dpi=213"

    /** Att U319AA */
    val U319AA = "spec:width=720,height=1440,unit=px,dpi=300"

    /** Att U626AA */
    val U626AA = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Att U705AA */
    val U705AA = "spec:width=720,height=1600,unit=px,dpi=300"

}
