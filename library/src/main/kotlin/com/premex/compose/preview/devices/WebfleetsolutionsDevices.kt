package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Webfleetsolutions device specifications for Android Compose previews.
 *
 * This extension provides Webfleetsolutions device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Webfleetsolutions.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Webfleetsolutions get() = object {
    /** Webfleetsolutions PRO 8475 */
    val PRO_8475 = "spec:width=600,height=1024,unit=px,dpi=160"

}
