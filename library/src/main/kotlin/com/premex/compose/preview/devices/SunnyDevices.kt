package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sunny device specifications for Android Compose previews.
 *
 * This extension provides Sunny device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sunny.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sunny get() = object {
    /** Sunny SN10016 */
    val SN10016 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sunny SN10064 */
    val SN10064 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Sunny SN7016 */
    val SN7016 = "spec:width=600,height=1024,unit=px,dpi=160"

}
