package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dialn device specifications for Android Compose previews.
 *
 * This extension provides Dialn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dialn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dialn get() = object {
    /** Dialn G10 */
    val G10 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Dialn G65 */
    val G65 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Dialn Neo */
    val NEO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Dialn Nova */
    val NOVA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Dialn S10 */
    val S10 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Dialn S8 */
    val S8 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Dialn X10G */
    val X10G = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Dialn X10 Pulse */
    val X10_PULSE = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Dialn X10ULTRA */
    val X10ULTRA = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Dialn X62 */
    val X62 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Dialn X62S */
    val X62S = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Dialn X65 */
    val X65 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Dialn X68 */
    val X68 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Dialn X8G */
    val X8G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Dialn X8ULTRA */
    val X8ULTRA = "spec:width=800,height=1280,unit=px,dpi=240"

}
