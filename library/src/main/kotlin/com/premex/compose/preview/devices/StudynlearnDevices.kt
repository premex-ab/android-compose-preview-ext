package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Studynlearn device specifications for Android Compose previews.
 *
 * This extension provides Studynlearn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Studynlearn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Studynlearn get() = object {
    /** Studynlearn IS-IFPSeries */
    val IS_IFPSERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

}
