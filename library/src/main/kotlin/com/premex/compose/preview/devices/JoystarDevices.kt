package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Joystar device specifications for Android Compose previews.
 *
 * This extension provides Joystar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Joystar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Joystar get() = object {
    /** Joystar  J6  */
    val J6 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Joystar JoyStar_J10 */
    val JOYSTAR_J10 = "spec:width=800,height=1280,unit=px,dpi=213"

}
