package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Logic device specifications for Android Compose previews.
 *
 * This extension provides Logic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Logic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Logic get() = object {
    /** Logic HX_Series */
    val HX_SERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Logic ZX_Series */
    val ZX_SERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

}
