package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Clover device specifications for Android Compose previews.
 *
 * This extension provides Clover device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Clover.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Clover get() = object {
    /** Clover FTab */
    val FTAB = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Clover G11 */
    val G11 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Clover KD101 */
    val KD101 = "spec:width=1200,height=1920,unit=px,dpi=213"

}
