package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mondial device specifications for Android Compose previews.
 *
 * This extension provides Mondial device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mondial.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mondial get() = object {
    /** Mondial TB_MONDIAL_KID */
    val TB_MONDIAL_KID = "spec:width=600,height=1024,unit=px,dpi=160"

}
