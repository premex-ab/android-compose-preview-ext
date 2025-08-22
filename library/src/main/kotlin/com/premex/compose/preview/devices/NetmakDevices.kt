package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Netmak device specifications for Android Compose previews.
 *
 * This extension provides Netmak device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Netmak.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Netmak get() = object {
    /** Netmak NM-VELOCITY */
    val NM_VELOCITY = "spec:width=600,height=1024,unit=px,dpi=160"

}
