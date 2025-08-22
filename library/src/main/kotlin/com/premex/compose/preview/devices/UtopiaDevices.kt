package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Utopia device specifications for Android Compose previews.
 *
 * This extension provides Utopia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Utopia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Utopia get() = object {
    /** Utopia UH0342  UHTABLET10.1INCH */
    val UH0342_UHTABLET10_1INCH = "spec:width=800,height=1280,unit=px,dpi=160"

}
