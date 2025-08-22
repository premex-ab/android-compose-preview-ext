package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nothing device specifications for Android Compose previews.
 *
 * This extension provides Nothing device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nothing.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nothing get() = object {
    /** Nothing Nothing Phone (1) */
    val NOTHING_PHONE_1 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Nothing Nothing Phone (2) */
    val NOTHING_PHONE_2 = "spec:width=1080,height=2412,unit=px,dpi=420"

    /** Nothing Nothing Phone (2a) */
    val NOTHING_PHONE_2A = "spec:width=1084,height=2412,unit=px,dpi=420"

    /** Nothing Nothing Phone (2a) Plus */
    val NOTHING_PHONE_2A_PLUS = "spec:width=1084,height=2412,unit=px,dpi=420"

    /** Nothing Nothing Phone (3) */
    val NOTHING_PHONE_3 = "spec:width=1260,height=2800,unit=px,dpi=480"

    /** Nothing Nothing Phone (3a) Pro */
    val NOTHING_PHONE_3A_PRO = "spec:width=1080,height=2392,unit=px,dpi=420"

}
