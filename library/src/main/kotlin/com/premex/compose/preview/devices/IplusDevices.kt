package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iplus device specifications for Android Compose previews.
 *
 * This extension provides Iplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iplus get() = object {
    /** Iplus iPlus P1 */
    val IPLUS_P1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Iplus iPlus_P3 */
    val IPLUS_P3 = "spec:width=540,height=1200,unit=px,dpi=240"

    /** Iplus Nu60 */
    val NU60 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Iplus Nu65 */
    val NU65 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Iplus Nu70 */
    val NU70 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Iplus Omega7 */
    val OMEGA7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Iplus Omega8 */
    val OMEGA8 = "spec:width=800,height=1280,unit=px,dpi=213"

}
