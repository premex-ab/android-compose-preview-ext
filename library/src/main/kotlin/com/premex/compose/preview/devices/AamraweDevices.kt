package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aamrawe device specifications for Android Compose previews.
 *
 * This extension provides Aamrawe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aamrawe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aamrawe get() = object {
    /** Aamrawe A10 */
    val A10 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Aamrawe A50 */
    val A50 = "spec:width=480,height=854,unit=px,dpi=240"

}
