package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gdmes device specifications for Android Compose previews.
 *
 * This extension provides Gdmes device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gdmes.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gdmes get() = object {
    /** Gdmes MB10 */
    val MB10 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Gdmes P4R */
    val P4R = "spec:width=720,height=1520,unit=px,dpi=320"

}
