package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Eachpai device specifications for Android Compose previews.
 *
 * This extension provides Eachpai device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Eachpai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Eachpai get() = object {
    /** Eachpai 706 */
    val _706 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Eachpai Q8 */
    val Q8 = "spec:width=600,height=1024,unit=px,dpi=160"

}
