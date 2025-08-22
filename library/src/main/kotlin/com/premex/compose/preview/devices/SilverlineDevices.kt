package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Silverline device specifications for Android Compose previews.
 *
 * This extension provides Silverline device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Silverline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Silverline get() = object {
    /** Silverline SL1021 */
    val SL1021 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Silverline SL1022 */
    val SL1022 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Silverline SL1046 */
    val SL1046 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Silverline SL1068 */
    val SL1068 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Silverline SL1069 */
    val SL1069 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Silverline SL721 */
    val SL721 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Silverline SL729 */
    val SL729 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Silverline SL868G */
    val SL868G = "spec:width=800,height=1280,unit=px,dpi=160"

}
