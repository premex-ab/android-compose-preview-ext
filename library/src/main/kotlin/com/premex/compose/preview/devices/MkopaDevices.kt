package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mkopa device specifications for Android Compose previews.
 *
 * This extension provides Mkopa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mkopa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mkopa get() = object {
    /** Mkopa M-KOPA M10 */
    val M_KOPA_M10 = "spec:width=576,height=1280,unit=px,dpi=213"

    /** Mkopa S34 */
    val S34 = "spec:width=720,height=1612,unit=px,dpi=320"

}
