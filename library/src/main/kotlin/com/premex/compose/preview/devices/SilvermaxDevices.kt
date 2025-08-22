package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Silvermax device specifications for Android Compose previews.
 *
 * This extension provides Silvermax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Silvermax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Silvermax get() = object {
    /** Silvermax ST-710G */
    val ST_710G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Silvermax ST-810 */
    val ST_810 = "spec:width=600,height=1024,unit=px,dpi=160"

}
