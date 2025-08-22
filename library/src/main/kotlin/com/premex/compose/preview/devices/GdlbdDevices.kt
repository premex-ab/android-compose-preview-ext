package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gdlbd device specifications for Android Compose previews.
 *
 * This extension provides Gdlbd device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gdlbd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gdlbd get() = object {
    /** Gdlbd G200 */
    val G200 = "spec:width=480,height=1014,unit=px,dpi=213"

    /** Gdlbd GDL GigaX Y21 */
    val GDL_GIGAX_Y21 = "spec:width=720,height=1650,unit=px,dpi=320"

    /** Gdlbd GigaX Y30 */
    val GIGAX_Y30 = "spec:width=720,height=1600,unit=px,dpi=320"

}
