package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Leeco device specifications for Android Compose previews.
 *
 * This extension provides Leeco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Leeco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Leeco get() = object {
    /** Leeco Le Max2 */
    val LE_MAX2 = "spec:width=1440,height=2560,unit=px,dpi=560"

    /** Leeco Le Pro3 */
    val LE_PRO3 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Leeco Le S3 */
    val LE_S3 = "spec:width=1080,height=1920,unit=px,dpi=420"

}
