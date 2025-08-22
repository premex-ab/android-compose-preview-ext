package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tagtech device specifications for Android Compose previews.
 *
 * This extension provides Tagtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tagtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tagtech get() = object {
    /** Tagtech TAG Phone */
    val TAG_PHONE = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Tagtech TAGPhone */
    val TAGPHONE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Tagtech Tagphone plus */
    val TAGPHONE_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Tagtech TAG-Pluto-TAB */
    val TAG_PLUTO_TAB = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Tagtech TAG_TAB_II */
    val TAG_TAB_II = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Tagtech TAG-TAB-III */
    val TAG_TAB_III = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Tagtech TAG-TABKIDS */
    val TAG_TABKIDS = "spec:width=800,height=1280,unit=px,dpi=240"

}
