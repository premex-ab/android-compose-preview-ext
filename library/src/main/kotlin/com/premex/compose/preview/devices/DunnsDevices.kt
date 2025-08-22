package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dunns device specifications for Android Compose previews.
 *
 * This extension provides Dunns device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dunns.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dunns get() = object {
    /** Dunns ETAB_M9041G */
    val ETAB_M9041G = "spec:width=600,height=1024,unit=px,dpi=160"

}
