package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Persona device specifications for Android Compose previews.
 *
 * This extension provides Persona device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Persona.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Persona get() = object {
    /** Persona MyTab_A8 */
    val MYTAB_A8 = "spec:width=800,height=1280,unit=px,dpi=213"

}
