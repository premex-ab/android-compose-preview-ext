package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kammunica device specifications for Android Compose previews.
 *
 * This extension provides Kammunica device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kammunica.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kammunica get() = object {
    /** Kammunica Kammunica_500V */
    val KAMMUNICA_500V = "spec:width=480,height=854,unit=px,dpi=205"

    /** Kammunica Kammunica_800 */
    val KAMMUNICA_800 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Kammunica Kammunica_XD */
    val KAMMUNICA_XD = "spec:width=800,height=1280,unit=px,dpi=320"

}
