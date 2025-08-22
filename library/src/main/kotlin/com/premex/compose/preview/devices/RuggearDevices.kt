package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ruggear device specifications for Android Compose previews.
 *
 * This extension provides Ruggear device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ruggear.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ruggear get() = object {
    /** Ruggear PSM01E */
    val PSM01E = "spec:width=640,height=1136,unit=px,dpi=320"

    /** Ruggear RG540 */
    val RG540 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Ruggear RG650 */
    val RG650 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ruggear RG655 */
    val RG655 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ruggear RG720 */
    val RG720 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Ruggear RG725_Q_US */
    val RG725_Q_US = "spec:width=640,height=1136,unit=px,dpi=320"

    /** Ruggear RG730 */
    val RG730 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Ruggear RG750 */
    val RG750 = "spec:width=640,height=1136,unit=px,dpi=320"

    /** Ruggear RG850 */
    val RG850 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ruggear RG880 */
    val RG880 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ruggear RG910 */
    val RG910 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Ruggear RG930i */
    val RG930I = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Ruggear RG935 */
    val RG935 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
