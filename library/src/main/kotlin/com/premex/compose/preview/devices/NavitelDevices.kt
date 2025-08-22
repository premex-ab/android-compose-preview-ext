package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Navitel device specifications for Android Compose previews.
 *
 * This extension provides Navitel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Navitel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Navitel get() = object {
    /** Navitel Navitel T700 3G Navi */
    val NAVITEL_T700_3G_NAVI = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Navitel NAVITEL_T757LTE_EEA */
    val NAVITEL_T757LTE_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Navitel NAVITEL_T797_4G */
    val NAVITEL_T797_4G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Navitel T500 3G */
    val T500_3G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Navitel T505PRO */
    val T505PRO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Navitel T707_3G */
    val T707_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Navitel T737PRO */
    val T737PRO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Navitel T787-4G */
    val T787_4G = "spec:width=600,height=1024,unit=px,dpi=160"

}
