package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Duoduogo device specifications for Android Compose previews.
 *
 * This extension provides Duoduogo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Duoduogo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Duoduogo get() = object {
    /** Duoduogo S10 */
    val S10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Duoduogo S10_EEA */
    val S10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Duoduogo S7_EEA  */
    val S7_EEA = "spec:width=800,height=1332,unit=px,dpi=160"

    /** Duoduogo S8 */
    val S8 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Duoduogo Tab_A7 */
    val TAB_A7 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Duoduogo TAB_S2 */
    val TAB_S2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Duoduogo TAB_S2_EEA */
    val TAB_S2_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

}
