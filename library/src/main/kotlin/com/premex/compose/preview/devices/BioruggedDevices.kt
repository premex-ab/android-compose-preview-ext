package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Biorugged device specifications for Android Compose previews.
 *
 * This extension provides Biorugged device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Biorugged.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Biorugged get() = object {
    /** Biorugged BIOWOLF8F30 */
    val BIOWOLF8F30 = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Biorugged BioWolf_C */
    val BIOWOLF_C = "spec:width=800,height=1280,unit=px,dpi=213"

}
