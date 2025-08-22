package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Everpad device specifications for Android Compose previews.
 *
 * This extension provides Everpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Everpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Everpad get() = object {
    /** Everpad EW2010 */
    val EW2010 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Everpad EW2020 */
    val EW2020 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Everpad EW2021 */
    val EW2021 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Everpad EW2022 */
    val EW2022 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Everpad VORTEX_V10 */
    val VORTEX_V10 = "spec:width=1200,height=2000,unit=px,dpi=280"

}
