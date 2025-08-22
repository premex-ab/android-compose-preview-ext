package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cellacom device specifications for Android Compose previews.
 *
 * This extension provides Cellacom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cellacom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cellacom get() = object {
    /** Cellacom Cellacom_S62 */
    val CELLACOM_S62 = "spec:width=600,height=1280,unit=px,dpi=240"

}
