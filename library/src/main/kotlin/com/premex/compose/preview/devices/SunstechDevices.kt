package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sunstech device specifications for Android Compose previews.
 *
 * This extension provides Sunstech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sunstech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sunstech get() = object {
    /** Sunstech TAB1011 */
    val TAB1011 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sunstech TAB1012 */
    val TAB1012 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Sunstech TAB1081_eea */
    val TAB1081_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sunstech TAB1090 */
    val TAB1090 = "spec:width=800,height=1280,unit=px,dpi=160"

}
