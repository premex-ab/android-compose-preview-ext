package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sogeneration device specifications for Android Compose previews.
 *
 * This extension provides Sogeneration device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sogeneration.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sogeneration get() = object {
    /** Sogeneration T8100 */
    val T8100 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Sogeneration T8116 */
    val T8116 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Sogeneration T8133_EEA */
    val T8133_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

}
