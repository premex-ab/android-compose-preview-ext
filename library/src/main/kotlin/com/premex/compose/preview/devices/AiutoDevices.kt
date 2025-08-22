package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aiuto device specifications for Android Compose previews.
 *
 * This extension provides Aiuto device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aiuto.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aiuto get() = object {
    /** Aiuto AT1001 */
    val AT1001 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aiuto AT1002 */
    val AT1002 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Aiuto AT702 */
    val AT702 = "spec:width=600,height=1024,unit=px,dpi=160"

}
