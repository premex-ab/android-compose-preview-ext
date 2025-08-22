package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Elelongmobile device specifications for Android Compose previews.
 *
 * This extension provides Elelongmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Elelongmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Elelongmobile get() = object {
    /** Elelongmobile Pad-S11 */
    val PAD_S11 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Elelongmobile Pad_S7 */
    val PAD_S7 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Elelongmobile Pad_S8 */
    val PAD_S8 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
