package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mozatab device specifications for Android Compose previews.
 *
 * This extension provides Mozatab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mozatab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mozatab get() = object {
    /** Mozatab MTN_E1 */
    val MTN_E1 = "spec:width=800,height=1280,unit=px,dpi=160"

}
