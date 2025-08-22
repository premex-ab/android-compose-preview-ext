package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Selfix device specifications for Android Compose previews.
 *
 * This extension provides Selfix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Selfix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Selfix get() = object {
    /** Selfix ES733 */
    val ES733 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Selfix X5 */
    val X5 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Selfix X7 */
    val X7 = "spec:width=720,height=1280,unit=px,dpi=320"

}
