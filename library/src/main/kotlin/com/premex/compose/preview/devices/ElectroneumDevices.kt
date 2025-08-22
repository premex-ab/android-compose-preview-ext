package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Electroneum device specifications for Android Compose previews.
 *
 * This extension provides Electroneum device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Electroneum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Electroneum get() = object {
    /** Electroneum electroneumM1 */
    val ELECTRONEUMM1 = "spec:width=480,height=854,unit=px,dpi=240"

}
