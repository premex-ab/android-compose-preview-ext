package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ehlel device specifications for Android Compose previews.
 *
 * This extension provides Ehlel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ehlel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ehlel get() = object {
    /** Ehlel Defender */
    val DEFENDER = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Ehlel Ehlel C7 PRO */
    val EHLEL_C7_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Ehlel HULAN21 PLUS */
    val HULAN21_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

}
