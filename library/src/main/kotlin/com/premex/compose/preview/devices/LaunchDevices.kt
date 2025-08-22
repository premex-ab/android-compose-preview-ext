package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Launch device specifications for Android Compose previews.
 *
 * This extension provides Launch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Launch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Launch get() = object {
    /** Launch Diagnostic_Tablet */
    val DIAGNOSTIC_TABLET = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Launch Diagnostic_Tool */
    val DIAGNOSTIC_TOOL = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Launch X-431 PAD VII */
    val X_431_PAD_VII = "spec:width=1080,height=1920,unit=px,dpi=240"

}
