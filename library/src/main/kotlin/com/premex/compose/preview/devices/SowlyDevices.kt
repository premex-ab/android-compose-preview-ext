package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sowly device specifications for Android Compose previews.
 *
 * This extension provides Sowly device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sowly.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sowly get() = object {
    /** Sowly AG_1088_A133  */
    val AG_1088_A133 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sowly AG_1088_A133P */
    val AG_1088_A133P = "spec:width=800,height=1280,unit=px,dpi=160"

}
