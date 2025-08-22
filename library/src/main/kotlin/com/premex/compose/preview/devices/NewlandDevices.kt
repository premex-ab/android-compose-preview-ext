package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Newland device specifications for Android Compose previews.
 *
 * This extension provides Newland device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Newland.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Newland get() = object {
    /** Newland Newland NLS-MT90 */
    val NEWLAND_NLS_MT90 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Newland Newland NLS-N7 */
    val NEWLAND_NLS_N7 = "spec:width=480,height=800,unit=px,dpi=213"

    /** Newland Newland NLS-NQuire */
    val NEWLAND_NLS_NQUIRE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Newland NLS-MT6550-AM */
    val NLS_MT6550_AM = "spec:width=480,height=800,unit=px,dpi=240"

    /** Newland NLS-MT6552-EEA */
    val NLS_MT6552_EEA = "spec:width=480,height=800,unit=px,dpi=240"

    /** Newland NLS-MT6552-GL */
    val NLS_MT6552_GL = "spec:width=480,height=800,unit=px,dpi=240"

    /** Newland NLS-MT6555-GL */
    val NLS_MT6555_GL = "spec:width=480,height=800,unit=px,dpi=240"

    /** Newland NLS-MT6755-GL */
    val NLS_MT6755_GL = "spec:width=480,height=800,unit=px,dpi=240"

    /** Newland NLS-MT9052-EEA */
    val NLS_MT9052_EEA = "spec:width=720,height=1280,unit=px,dpi=294"

    /** Newland NLS-MT9055-GL */
    val NLS_MT9055_GL = "spec:width=720,height=1280,unit=px,dpi=294"

    /** Newland NLS-MT93 */
    val NLS_MT93 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Newland NLS-MT95 */
    val NLS_MT95 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Newland NLS-N7 */
    val NLS_N7 = "spec:width=480,height=800,unit=px,dpi=160"

    /** Newland NLS-NFT10 */
    val NLS_NFT10 = "spec:width=720,height=1440,unit=px,dpi=320"

}
