package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ashtel device specifications for Android Compose previews.
 *
 * This extension provides Ashtel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ashtel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ashtel get() = object {
    /** Ashtel RAVOZ_Z5 */
    val RAVOZ_Z5 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Ashtel RAVOZ Z5 Lite */
    val RAVOZ_Z5_LITE = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Ashtel RAVOZ Z7 */
    val RAVOZ_Z7 = "spec:width=720,height=1440,unit=px,dpi=320"

}
