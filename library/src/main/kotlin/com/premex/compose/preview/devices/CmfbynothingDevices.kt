package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cmfbynothing device specifications for Android Compose previews.
 *
 * This extension provides Cmfbynothing device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cmfbynothing.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cmfbynothing get() = object {
    /** Cmfbynothing CMF by Nothing Phone 1 */
    val CMF_BY_NOTHING_PHONE_1 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Cmfbynothing CMF Phone 2 Pro */
    val CMF_PHONE_2_PRO = "spec:width=1080,height=2392,unit=px,dpi=420"

}
