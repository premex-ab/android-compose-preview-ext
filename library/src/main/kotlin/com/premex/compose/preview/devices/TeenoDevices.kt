package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Teeno device specifications for Android Compose previews.
 *
 * This extension provides Teeno device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Teeno.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Teeno get() = object {
    /** Teeno A1 */
    val A1 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Teeno TEENO_i12 */
    val TEENO_I12 = "spec:width=720,height=1560,unit=px,dpi=320"

}
