package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Scope device specifications for Android Compose previews.
 *
 * This extension provides Scope device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Scope.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Scope get() = object {
    /** Scope F503V */
    val F503V = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Scope F5O3V */
    val F5O3V = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Scope SP1089 */
    val SP1089 = "spec:width=800,height=1280,unit=px,dpi=213"

}
