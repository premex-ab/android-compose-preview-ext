package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Axmeta device specifications for Android Compose previews.
 *
 * This extension provides Axmeta device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Axmeta.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Axmeta get() = object {
    /** Axmeta AX_META_Tab_7 */
    val AX_META_TAB_7 = "spec:width=600,height=1024,unit=px,dpi=180"

}
