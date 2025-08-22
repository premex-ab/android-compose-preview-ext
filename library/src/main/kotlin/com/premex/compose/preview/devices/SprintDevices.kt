package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sprint device specifications for Android Compose previews.
 *
 * This extension provides Sprint device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sprint.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sprint get() = object {
    /** Sprint AQT100 */
    val AQT100 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Sprint AQT82 */
    val AQT82 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Sprint Slate 8 Tablet */
    val SLATE_8_TABLET = "spec:width=800,height=1280,unit=px,dpi=213"

}
