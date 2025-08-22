package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Avhsanluissa device specifications for Android Compose previews.
 *
 * This extension provides Avhsanluissa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Avhsanluissa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Avhsanluissa get() = object {
    /** Avhsanluissa Excer 10PRO */
    val EXCER_10PRO = "spec:width=800,height=1280,unit=px,dpi=213"

}
