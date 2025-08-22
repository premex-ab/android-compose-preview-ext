package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Moolahmobile device specifications for Android Compose previews.
 *
 * This extension provides Moolahmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Moolahmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Moolahmobile get() = object {
    /** Moolahmobile T10 */
    val T10 = "spec:width=800,height=1280,unit=px,dpi=186"

    /** Moolahmobile T100 */
    val T100 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Moolahmobile T10_Pro */
    val T10_PRO = "spec:width=800,height=1280,unit=px,dpi=200"

}
