package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Westgateresorts device specifications for Android Compose previews.
 *
 * This extension provides Westgateresorts device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Westgateresorts.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Westgateresorts get() = object {
    /** Westgateresorts T802 */
    val T802 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Westgateresorts T803 */
    val T803 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Westgateresorts T805 */
    val T805 = "spec:width=800,height=1280,unit=px,dpi=160"

}
