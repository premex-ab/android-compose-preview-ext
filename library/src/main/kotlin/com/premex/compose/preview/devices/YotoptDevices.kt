package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Yotopt device specifications for Android Compose previews.
 *
 * This extension provides Yotopt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Yotopt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Yotopt get() = object {
    /** Yotopt  Q11-EEA */
    val Q11_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Yotopt X109 */
    val X109 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Yotopt Y103_EEA */
    val Y103_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Yotopt Y121-EEA */
    val Y121_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Yotopt Y3-EEA */
    val Y3_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Yotopt Y61 */
    val Y61 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Yotopt Y61-EEA */
    val Y61_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Yotopt Y8-EEA */
    val Y8_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
