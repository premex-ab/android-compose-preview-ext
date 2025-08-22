package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mobulaa device specifications for Android Compose previews.
 *
 * This extension provides Mobulaa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mobulaa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mobulaa get() = object {
    /** Mobulaa K6 */
    val K6 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mobulaa MOBULAA Note4 */
    val MOBULAA_NOTE4 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Mobulaa NOTE1  */
    val NOTE1 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Mobulaa NOTE2 */
    val NOTE2 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Mobulaa S11 */
    val S11 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mobulaa Tab-1 */
    val TAB_1 = "spec:width=800,height=1280,unit=px,dpi=213"

}
