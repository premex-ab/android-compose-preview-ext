package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Smadl device specifications for Android Compose previews.
 *
 * This extension provides Smadl device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Smadl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Smadl get() = object {
    /** Smadl Abay5_Plus */
    val ABAY5_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Smadl Safari */
    val SAFARI = "spec:width=480,height=960,unit=px,dpi=240"

    /** Smadl Safari_2 */
    val SAFARI_2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Smadl Safari_ 2plus */
    val SAFARI_2PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Smadl SMADL */
    val SMADL = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Smadl SMADL_R35 */
    val SMADL_R35 = "spec:width=480,height=854,unit=px,dpi=240"

}
