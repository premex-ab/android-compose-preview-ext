package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hytera device specifications for Android Compose previews.
 *
 * This extension provides Hytera device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hytera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hytera get() = object {
    /** Hytera PDC550 */
    val PDC550 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hytera PDC680 */
    val PDC680 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hytera PNC460 */
    val PNC460 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Hytera PNC550_P_TU */
    val PNC550_P_TU = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Hytera PNC560 */
    val PNC560 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Hytera PTC680 */
    val PTC680 = "spec:width=720,height=1280,unit=px,dpi=320"

}
