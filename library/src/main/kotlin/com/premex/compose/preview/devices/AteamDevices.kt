package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ateam device specifications for Android Compose previews.
 *
 * This extension provides Ateam device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ateam.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ateam get() = object {
    /** Ateam A1010 */
    val A1010 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ateam A801 */
    val A801 = "spec:width=800,height=1280,unit=px,dpi=213"

}
