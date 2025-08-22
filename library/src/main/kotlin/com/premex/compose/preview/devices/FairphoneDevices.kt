package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fairphone device specifications for Android Compose previews.
 *
 * This extension provides Fairphone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fairphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fairphone get() = object {
    /** Fairphone Fairphone3 */
    val FAIRPHONE3 = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Fairphone Fairphone4 */
    val FAIRPHONE4 = "spec:width=1080,height=2340,unit=px,dpi=400"

    /** Fairphone Fairphone 5 5G */
    val FAIRPHONE_5_5G = "spec:width=1224,height=2700,unit=px,dpi=480"

    /** Fairphone FP2 */
    val FP2 = "spec:width=1080,height=1920,unit=px,dpi=440"

    /** Fairphone The Fairphone (Gen. 6) */
    val THE_FAIRPHONE_GEN_6 = "spec:width=1116,height=2484,unit=px,dpi=480"

}
