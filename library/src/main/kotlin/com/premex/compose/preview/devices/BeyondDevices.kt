package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Beyond device specifications for Android Compose previews.
 *
 * This extension provides Beyond device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Beyond.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Beyond get() = object {
    /** Beyond MAX4 */
    val MAX4 = "spec:width=480,height=996,unit=px,dpi=240"

}
