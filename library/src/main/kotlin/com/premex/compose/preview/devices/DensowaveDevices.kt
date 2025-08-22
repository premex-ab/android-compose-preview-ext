package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Densowave device specifications for Android Compose previews.
 *
 * This extension provides Densowave device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Densowave.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Densowave get() = object {
    /** Densowave BHT-1700BWB-A7 */
    val BHT_1700BWB_A7 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Densowave BHT-1700QWB-1-A7 */
    val BHT_1700QWB_1_A7 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Densowave BHT-1700QWB-2-A7 */
    val BHT_1700QWB_2_A7 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Densowave BHT-1700QWBG-1-A7 */
    val BHT_1700QWBG_1_A7 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Densowave BHT-1700QWBG-2-A7 */
    val BHT_1700QWBG_2_A7 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Densowave BHT-1800QWB-1-A7 */
    val BHT_1800QWB_1_A7 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Densowave BHT-1800QWBG-1-A7 */
    val BHT_1800QWBG_1_A7 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Densowave BHT-M60-QW-A10 */
    val BHT_M60_QW_A10 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Densowave BHT-M60-QWG-A10 */
    val BHT_M60_QWG_A10 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Densowave BHT-M70-QW-A10 */
    val BHT_M70_QW_A10 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Densowave BHT-M70-QWG-A10 */
    val BHT_M70_QWG_A10 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Densowave BHT-M80-QW-A10 */
    val BHT_M80_QW_A10 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Densowave BHT-M80-QWG-A10 */
    val BHT_M80_QWG_A10 = "spec:width=720,height=1280,unit=px,dpi=320"

}
