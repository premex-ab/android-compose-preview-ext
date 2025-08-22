package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ans device specifications for Android Compose previews.
 *
 * This extension provides Ans device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ans.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ans get() = object {
    /** Ans L50 */
    val L50 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ans L51 */
    val L51 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ans UL40 */
    val UL40 = "spec:width=480,height=800,unit=px,dpi=240"

}
