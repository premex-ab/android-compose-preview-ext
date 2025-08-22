package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zamolxe device specifications for Android Compose previews.
 *
 * This extension provides Zamolxe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zamolxe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zamolxe get() = object {
    /** Zamolxe ZXT-10FL323G-PRO */
    val ZXT_10FL323G_PRO = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Zamolxe ZXT-10HL323S */
    val ZXT_10HL323S = "spec:width=800,height=1280,unit=px,dpi=213"

}
