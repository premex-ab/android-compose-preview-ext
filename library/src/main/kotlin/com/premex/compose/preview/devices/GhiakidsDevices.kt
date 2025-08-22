package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ghiakids device specifications for Android Compose previews.
 *
 * This extension provides Ghiakids device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ghiakids.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ghiakids get() = object {
    /** Ghiakids  GTKIDS7 */
    val GTKIDS7 = "spec:width=600,height=1024,unit=px,dpi=160"

}
