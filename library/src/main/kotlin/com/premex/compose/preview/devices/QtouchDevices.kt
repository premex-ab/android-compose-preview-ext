package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Qtouch device specifications for Android Compose previews.
 *
 * This extension provides Qtouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Qtouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Qtouch get() = object {
    /** Qtouch Q524 */
    val Q524 = "spec:width=480,height=854,unit=px,dpi=180"

    /** Qtouch Q624 */
    val Q624 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Qtouch Q624H */
    val Q624H = "spec:width=720,height=1612,unit=px,dpi=320"

}
