package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Legend device specifications for Android Compose previews.
 *
 * This extension provides Legend device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Legend.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Legend get() = object {
    /** Legend ACE_I */
    val ACE_I = "spec:width=480,height=854,unit=px,dpi=240"

    /** Legend IPF10 */
    val IPF10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Legend NEBULAE */
    val NEBULAE = "spec:width=720,height=1440,unit=px,dpi=320"

}
