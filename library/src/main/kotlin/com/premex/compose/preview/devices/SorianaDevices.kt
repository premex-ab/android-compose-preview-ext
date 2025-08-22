package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Soriana device specifications for Android Compose previews.
 *
 * This extension provides Soriana device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Soriana.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Soriana get() = object {
    /** Soriana BE_ets */
    val BE_ETS = "spec:width=480,height=854,unit=px,dpi=240"

}
