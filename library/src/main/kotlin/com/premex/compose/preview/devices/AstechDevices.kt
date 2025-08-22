package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Astech device specifications for Android Compose previews.
 *
 * This extension provides Astech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Astech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Astech get() = object {
    /** Astech Astech_IRIS */
    val ASTECH_IRIS = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Astech Astech S7 */
    val ASTECH_S7 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Astech Astech_S8 */
    val ASTECH_S8 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Astech Astech_S9 */
    val ASTECH_S9 = "spec:width=720,height=1612,unit=px,dpi=280"

}
