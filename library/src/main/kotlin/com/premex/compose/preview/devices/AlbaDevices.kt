package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Alba device specifications for Android Compose previews.
 *
 * This extension provides Alba device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Alba.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Alba get() = object {
    /** Alba Alba10Nou */
    val ALBA10NOU = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Alba Alba10Pie */
    val ALBA10PIE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Alba Alba10Q */
    val ALBA10Q = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Alba Alba 6 */
    val ALBA_6 = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Alba Alba7Nou */
    val ALBA7NOU = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Alba Alba7Pie */
    val ALBA7PIE = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Alba Alba7Q */
    val ALBA7Q = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Alba Alba8Nou */
    val ALBA8NOU = "spec:width=800,height=1280,unit=px,dpi=213"

}
