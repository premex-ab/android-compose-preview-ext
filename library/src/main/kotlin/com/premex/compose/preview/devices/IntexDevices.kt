package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Intex device specifications for Android Compose previews.
 *
 * This extension provides Intex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Intex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Intex get() = object {
    /** Intex Aqua A4+ */
    val AQUA_A4 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Intex Aqua Lions 2 */
    val AQUA_LIONS_2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Intex Aqua Lions 3 */
    val AQUA_LIONS_3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Intex Aqua_Lions_4G */
    val AQUA_LIONS_4G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Intex Aqua Ring */
    val AQUA_RING = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Intex Aqua Supreme+ */
    val AQUA_SUPREME = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Intex INTEX_AQUA_S3 */
    val INTEX_AQUA_S3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Intex INTEX Aqua Selfie */
    val INTEX_AQUA_SELFIE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Intex INTEX AQUA STYLE 3 */
    val INTEX_AQUA_STYLE_3 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Intex T1 Plus */
    val T1_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

}
