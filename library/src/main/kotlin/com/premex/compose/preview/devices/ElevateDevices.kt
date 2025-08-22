package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Elevate device specifications for Android Compose previews.
 *
 * This extension provides Elevate device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Elevate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Elevate get() = object {
    /** Elevate G55_LITE */
    val G55_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Elevate LUNA G5 */
    val LUNA_G5 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Elevate LUNA G50 */
    val LUNA_G50 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Elevate LUNA G58 */
    val LUNA_G58 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Elevate LUNA G60 */
    val LUNA_G60 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Elevate LUNA G60X */
    val LUNA_G60X = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Elevate LUNA G62 */
    val LUNA_G62 = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Elevate LUNA V55 */
    val LUNA_V55 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Elevate LUNA V57 */
    val LUNA_V57 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Elevate R50A */
    val R50A = "spec:width=480,height=854,unit=px,dpi=240"

    /** Elevate V55C */
    val V55C = "spec:width=1080,height=1920,unit=px,dpi=480"

}
