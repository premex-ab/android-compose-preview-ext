package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gtideextreme device specifications for Android Compose previews.
 *
 * This extension provides Gtideextreme device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gtideextreme.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gtideextreme get() = object {
    /** Gtideextreme EX760 */
    val EX760 = "spec:width=800,height=1280,unit=px,dpi=180"

}
