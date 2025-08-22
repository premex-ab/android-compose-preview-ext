package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Figo device specifications for Android Compose previews.
 *
 * This extension provides Figo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Figo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Figo get() = object {
    /** Figo Fierce_L5510 */
    val FIERCE_L5510 = "spec:width=480,height=960,unit=px,dpi=180"

    /** Figo Orbit_ll */
    val ORBIT_LL = "spec:width=480,height=800,unit=px,dpi=240"

    /** Figo Ultra J8 */
    val ULTRA_J8 = "spec:width=480,height=854,unit=px,dpi=240"

}
