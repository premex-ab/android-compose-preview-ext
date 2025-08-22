package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Preo device specifications for Android Compose previews.
 *
 * This extension provides Preo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Preo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Preo get() = object {
    /** Preo PTABP10 */
    val PTABP10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Preo PTAB_P8 */
    val PTAB_P8 = "spec:width=800,height=1280,unit=px,dpi=160"

}
