package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kanselir device specifications for Android Compose previews.
 *
 * This extension provides Kanselir device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kanselir.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kanselir get() = object {
    /** Kanselir KTB-168 */
    val KTB_168 = "spec:width=800,height=1280,unit=px,dpi=213"

}
