package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wowi device specifications for Android Compose previews.
 *
 * This extension provides Wowi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wowi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wowi get() = object {
    /** Wowi S8e */
    val S8E = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Wowi SQ753 */
    val SQ753 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wowi SQ788 */
    val SQ788 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Wowi SQ788_1 */
    val SQ788_1 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Wowi SQ788Extreme */
    val SQ788EXTREME = "spec:width=480,height=854,unit=px,dpi=240"

    /** Wowi Tab_X5 */
    val TAB_X5 = "spec:width=800,height=1280,unit=px,dpi=213"

}
