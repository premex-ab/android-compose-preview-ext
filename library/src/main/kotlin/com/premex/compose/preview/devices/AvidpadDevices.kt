package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Avidpad device specifications for Android Compose previews.
 *
 * This extension provides Avidpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Avidpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Avidpad get() = object {
    /** Avidpad A30 */
    val A30 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Avidpad A30PRO */
    val A30PRO = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Avidpad A60 */
    val A60 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Avidpad S30 */
    val S30 = "spec:width=800,height=1340,unit=px,dpi=240"

    /** Avidpad S60 */
    val S60 = "spec:width=1200,height=2000,unit=px,dpi=284"

    /** Avidpad S80 */
    val S80 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
