package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xtratech device specifications for Android Compose previews.
 *
 * This extension provides Xtratech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xtratech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xtratech get() = object {
    /** Xtratech BRIO_X31 */
    val BRIO_X31 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Xtratech X10MT16 */
    val X10MT16 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xtratech X10MT87 */
    val X10MT87 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xtratech X739Q */
    val X739Q = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xtratech X8MT16 */
    val X8MT16 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xtratech X8MT87 */
    val X8MT87 = "spec:width=800,height=1280,unit=px,dpi=160"

}
