package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Oasys device specifications for Android Compose previews.
 *
 * This extension provides Oasys device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Oasys.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Oasys get() = object {
    /** Oasys TEG9300 */
    val TEG9300 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Oasys TEG9300-4 */
    val TEG9300_4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Oasys TEG9300-5 */
    val TEG9300_5 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Oasys TEG9300-M */
    val TEG9300_M = "spec:width=720,height=1440,unit=px,dpi=320"

}
