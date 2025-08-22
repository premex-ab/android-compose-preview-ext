package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Insignia device specifications for Android Compose previews.
 *
 * This extension provides Insignia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Insignia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Insignia get() = object {
    /** Insignia NS-14T002 */
    val NS_14T002 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Insignia NS-P08A7100 */
    val NS_P08A7100 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Insignia NS-P10A6100 */
    val NS_P10A6100 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Insignia NS-P10A7100 */
    val NS_P10A7100 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Insignia NS-P10A8100 */
    val NS_P10A8100 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Insignia NS-P11A8100 */
    val NS_P11A8100 = "spec:width=768,height=1366,unit=px,dpi=160"

}
