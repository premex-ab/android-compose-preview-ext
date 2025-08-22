package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ciber device specifications for Android Compose previews.
 *
 * This extension provides Ciber device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ciber.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ciber get() = object {
    /** Ciber B610A103A */
    val B610A103A = "spec:width=800,height=1280,unit=px,dpi=204"

    /** Ciber B610A115 */
    val B610A115 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Ciber B610A215 */
    val B610A215 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
