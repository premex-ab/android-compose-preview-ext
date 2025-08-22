package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Navcity device specifications for Android Compose previews.
 *
 * This extension provides Navcity device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Navcity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Navcity get() = object {
    /** Navcity NP752 */
    val NP752 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Navcity NP-752GO */
    val NP_752GO = "spec:width=480,height=854,unit=px,dpi=240"

}
