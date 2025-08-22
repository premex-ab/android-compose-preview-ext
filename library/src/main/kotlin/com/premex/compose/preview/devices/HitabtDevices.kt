package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hitabt device specifications for Android Compose previews.
 *
 * This extension provides Hitabt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hitabt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hitabt get() = object {
    /** Hitabt K30A */
    val K30A = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Hitabt 	P30A */
    val P30A = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Hitabt T30A_SY07PC01 */
    val T30A_SY07PC01 = "spec:width=800,height=1280,unit=px,dpi=160"

}
