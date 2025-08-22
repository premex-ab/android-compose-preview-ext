package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cipherlab device specifications for Android Compose previews.
 *
 * This extension provides Cipherlab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cipherlab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cipherlab get() = object {
    /** Cipherlab RK25 */
    val RK25 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Cipherlab RK25WO */
    val RK25WO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Cipherlab RK26 */
    val RK26 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Cipherlab RK95 */
    val RK95 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Cipherlab RS10 */
    val RS10 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Cipherlab RS31 */
    val RS31 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cipherlab RS35 */
    val RS35 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cipherlab RS36 */
    val RS36 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cipherlab RS38 */
    val RS38 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Cipherlab RS51_HS */
    val RS51_HS = "spec:width=720,height=1280,unit=px,dpi=320"

}
