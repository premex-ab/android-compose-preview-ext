package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Indigi device specifications for Android Compose previews.
 *
 * This extension provides Indigi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Indigi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Indigi get() = object {
    /** Indigi G4i */
    val G4I = "spec:width=600,height=1024,unit=px,dpi=213"

}
