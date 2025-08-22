package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cyxgroup device specifications for Android Compose previews.
 *
 * This extension provides Cyxgroup device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cyxgroup.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cyxgroup get() = object {
    /** Cyxgroup A7008 */
    val A7008 = "spec:width=600,height=1024,unit=px,dpi=160"

}
