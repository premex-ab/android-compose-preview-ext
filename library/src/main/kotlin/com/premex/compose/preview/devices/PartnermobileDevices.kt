package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Partnermobile device specifications for Android Compose previews.
 *
 * This extension provides Partnermobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Partnermobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Partnermobile get() = object {
    /** Partnermobile E22 */
    val E22 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Partnermobile EV1_PRO */
    val EV1_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

}
