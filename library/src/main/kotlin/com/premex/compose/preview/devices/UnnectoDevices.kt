package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Unnecto device specifications for Android Compose previews.
 *
 * This extension provides Unnecto device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Unnecto.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Unnecto get() = object {
    /** Unnecto Bolt1 */
    val BOLT1 = "spec:width=480,height=854,unit=px,dpi=180"

    /** Unnecto UB101 */
    val UB101 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Unnecto UB202  */
    val UB202 = "spec:width=720,height=1600,unit=px,dpi=480"

}
