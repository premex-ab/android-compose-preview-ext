package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bleck device specifications for Android Compose previews.
 *
 * This extension provides Bleck device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bleck.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bleck get() = object {
    /** Bleck BE dg */
    val BE_DG = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bleck BE_et */
    val BE_ET = "spec:width=480,height=854,unit=px,dpi=240"

    /** Bleck BE_se */
    val BE_SE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bleck O2 */
    val O2 = "spec:width=720,height=1440,unit=px,dpi=320"

}
