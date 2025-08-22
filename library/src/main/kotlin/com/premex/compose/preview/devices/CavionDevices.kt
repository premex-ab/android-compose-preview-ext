package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cavion device specifications for Android Compose previews.
 *
 * This extension provides Cavion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cavion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cavion get() = object {
    /** Cavion base10.3g silver */
    val BASE10_3G_SILVER = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Cavion Base_5.0 */
    val BASE_5_0 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Cavion M1092Q */
    val M1092Q = "spec:width=800,height=1280,unit=px,dpi=160"

}
