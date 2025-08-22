package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Opelmobile device specifications for Android Compose previews.
 *
 * This extension provides Opelmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Opelmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Opelmobile get() = object {
    /** Opelmobile EasySmart 2 */
    val EASYSMART_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Opelmobile OMSJ523B */
    val OMSJ523B = "spec:width=540,height=960,unit=px,dpi=240"

    /** Opelmobile Opel Mobile_Smart_J2 */
    val OPEL_MOBILE_SMART_J2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Opelmobile Opel Smart60R */
    val OPEL_SMART60R = "spec:width=480,height=960,unit=px,dpi=200"

    /** Opelmobile Rugged60Q */
    val RUGGED60Q = "spec:width=480,height=960,unit=px,dpi=240"

    /** Opelmobile S55 */
    val S55 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Opelmobile Smart55Q */
    val SMART55Q = "spec:width=480,height=960,unit=px,dpi=200"

    /** Opelmobile Smart55R */
    val SMART55R = "spec:width=480,height=960,unit=px,dpi=220"

    /** Opelmobile Smart65E */
    val SMART65E = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Opelmobile Smart65Q */
    val SMART65Q = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Opelmobile Smart65R */
    val SMART65R = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Opelmobile SMARTJ5-M */
    val SMARTJ5_M = "spec:width=540,height=960,unit=px,dpi=240"

    /** Opelmobile SmartJX */
    val SMARTJX = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Opelmobile SMARTKIDS */
    val SMARTKIDS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Opelmobile SmartX1 */
    val SMARTX1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Opelmobile Smart X6 */
    val SMART_X6 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Opelmobile SmartX65 */
    val SMARTX65 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Opelmobile SmartZ6 */
    val SMARTZ6 = "spec:width=720,height=1560,unit=px,dpi=300"

}
