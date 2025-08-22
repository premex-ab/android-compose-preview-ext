package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Soda device specifications for Android Compose previews.
 *
 * This extension provides Soda device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Soda.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Soda get() = object {
    /** Soda Note 12 */
    val NOTE_12 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Soda Note 12Pro */
    val NOTE_12PRO = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Soda ROCK_30 */
    val ROCK_30 = "spec:width=720,height=1612,unit=px,dpi=320"

}
