package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xoro device specifications for Android Compose previews.
 *
 * This extension provides Xoro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xoro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xoro get() = object {
    /** Xoro Megapad_1333 */
    val MEGAPAD_1333 = "spec:width=1080,height=1920,unit=px,dpi=213"

    /** Xoro Megapad_1333_Pro */
    val MEGAPAD_1333_PRO = "spec:width=1080,height=1920,unit=px,dpi=213"

}
