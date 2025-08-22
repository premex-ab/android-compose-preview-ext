package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Suntak device specifications for Android Compose previews.
 *
 * This extension provides Suntak device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Suntak.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Suntak get() = object {
    /** Suntak MOJO */
    val MOJO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Suntak MOX  2 */
    val MOX_2 = "spec:width=720,height=1600,unit=px,dpi=320"

}
