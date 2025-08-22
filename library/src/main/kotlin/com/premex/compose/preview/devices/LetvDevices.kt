package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Letv device specifications for Android Compose previews.
 *
 * This extension provides Letv device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Letv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Letv get() = object {
    /** Letv Le 2 */
    val LE_2 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Letv Le X507 */
    val LE_X507 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Letv x600 */
    val X600 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
