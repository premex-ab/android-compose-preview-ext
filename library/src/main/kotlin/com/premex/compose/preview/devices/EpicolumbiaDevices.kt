package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Epicolumbia device specifications for Android Compose previews.
 *
 * This extension provides Epicolumbia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Epicolumbia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Epicolumbia get() = object {
    /** Epicolumbia TAB-001 */
    val TAB_001 = "spec:width=800,height=1280,unit=px,dpi=160"

}
