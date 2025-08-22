package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vale device specifications for Android Compose previews.
 *
 * This extension provides Vale device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vale.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vale get() = object {
    /** Vale V10A */
    val V10A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vale V10E-LTE */
    val V10E_LTE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vale V11E LTE_4128 */
    val V11E_LTE_4128 = "spec:width=1200,height=1920,unit=px,dpi=200"

    /** Vale V12E-LTE */
    val V12E_LTE = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Vale V12E LTE_14 */
    val V12E_LTE_14 = "spec:width=1200,height=2000,unit=px,dpi=240"

}
