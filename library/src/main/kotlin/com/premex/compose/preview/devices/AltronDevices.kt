package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Altron device specifications for Android Compose previews.
 *
 * This extension provides Altron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Altron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Altron get() = object {
    /** Altron BE-730 */
    val BE_730 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Altron OB-1021 */
    val OB_1021 = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Altron OB_588 */
    val OB_588 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Altron OB_628 */
    val OB_628 = "spec:width=480,height=960,unit=px,dpi=204"

    /** Altron OB-728 */
    val OB_728 = "spec:width=600,height=1024,unit=px,dpi=160"

}
