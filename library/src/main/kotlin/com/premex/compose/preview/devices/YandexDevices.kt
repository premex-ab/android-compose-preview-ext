package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Yandex device specifications for Android Compose previews.
 *
 * This extension provides Yandex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Yandex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Yandex get() = object {
    /** Yandex YNDX-000SB */
    val YNDX_000SB = "spec:width=1080,height=2160,unit=px,dpi=420"

}
