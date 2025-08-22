package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Novinsun device specifications for Android Compose previews.
 *
 * This extension provides Novinsun device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Novinsun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Novinsun get() = object {
    /** Novinsun TN618 */
    val TN618 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
