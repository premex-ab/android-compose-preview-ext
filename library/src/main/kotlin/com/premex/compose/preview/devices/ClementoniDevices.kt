package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Clementoni device specifications for Android Compose previews.
 *
 * This extension provides Clementoni device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Clementoni.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Clementoni get() = object {
    /** Clementoni CLEMPAD10_2023 */
    val CLEMPAD10_2023 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Clementoni CLEMPAD_2018 */
    val CLEMPAD_2018 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Clementoni Clempad 8 */
    val CLEMPAD_8 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Clementoni Clempad_9 */
    val CLEMPAD_9 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Clementoni Clemphone 7.0 */
    val CLEMPHONE_7_0 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Clementoni MFC_2018 */
    val MFC_2018 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Clementoni MFC_8 */
    val MFC_8 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Clementoni MFClempad_9 */
    val MFCLEMPAD_9 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Clementoni MFClempadP_9 */
    val MFCLEMPADP_9 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Clementoni My First Clempad 7 */
    val MY_FIRST_CLEMPAD_7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Clementoni Neo_Clempad_2021 */
    val NEO_CLEMPAD_2021 = "spec:width=800,height=1280,unit=px,dpi=213"

}
