package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lgelectronics device specifications for Android Compose previews.
 *
 * This extension provides Lgelectronics device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lgelectronics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lgelectronics get() = object {
    /** Lgelectronics TR3DK */
    val TR3DK = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Lgelectronics TR3DQ-B */
    val TR3DQ_B = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Lgelectronics TR3PN */
    val TR3PN = "spec:width=2160,height=3840,unit=px,dpi=480"

}
