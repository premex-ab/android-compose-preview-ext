package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Anywaygo device specifications for Android Compose previews.
 *
 * This extension provides Anywaygo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Anywaygo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Anywaygo get() = object {
    /** Anywaygo Anya_S5U */
    val ANYA_S5U = "spec:width=480,height=854,unit=px,dpi=200"

    /** Anywaygo TP1040 */
    val TP1040 = "spec:width=800,height=1332,unit=px,dpi=160"

}
