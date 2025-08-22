package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Larvand device specifications for Android Compose previews.
 *
 * This extension provides Larvand device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Larvand.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Larvand get() = object {
    /** Larvand M863TabH8 */
    val M863TABH8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Larvand M863TabH8 */
    val M863TABH8_800X1280 = "spec:width=800,height=1280,unit=px,dpi=240"

}
