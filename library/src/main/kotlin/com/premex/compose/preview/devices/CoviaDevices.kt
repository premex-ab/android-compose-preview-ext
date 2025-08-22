package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Covia device specifications for Android Compose previews.
 *
 * This extension provides Covia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Covia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Covia get() = object {
    /** Covia CP-L45s */
    val CP_L45S = "spec:width=480,height=854,unit=px,dpi=240"

    /** Covia CP-W5s */
    val CP_W5S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Covia g06+ */
    val G06 = "spec:width=480,height=800,unit=px,dpi=240"

}
