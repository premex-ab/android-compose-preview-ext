package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aoskey device specifications for Android Compose previews.
 *
 * This extension provides Aoskey device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aoskey.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aoskey get() = object {
    /** Aoskey F11 */
    val F11 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Aoskey P21 */
    val P21 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
