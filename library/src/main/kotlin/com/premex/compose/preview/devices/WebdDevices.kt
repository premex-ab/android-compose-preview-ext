package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Webd device specifications for Android Compose previews.
 *
 * This extension provides Webd device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Webd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Webd get() = object {
    /** Webd F1 */
    val F1 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Webd L7 */
    val L7 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Webd T1 */
    val T1 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Webd WE F20 */
    val WE_F20 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Webd WE L9 */
    val WE_L9 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Webd WE R4 */
    val WE_R4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Webd WE V5 */
    val WE_V5 = "spec:width=720,height=1440,unit=px,dpi=320"

}
