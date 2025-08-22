package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Precisionbiometric device specifications for Android Compose previews.
 *
 * This extension provides Precisionbiometric device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Precisionbiometric.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Precisionbiometric get() = object {
    /** Precisionbiometric PBTAB-100 */
    val PBTAB_100 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Precisionbiometric PBTAB100-1G3 */
    val PBTAB100_1G3 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Precisionbiometric PBTAB100-2G4 */
    val PBTAB100_2G4 = "spec:width=600,height=1024,unit=px,dpi=160"

}
