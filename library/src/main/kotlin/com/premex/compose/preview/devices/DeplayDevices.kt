package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Deplay device specifications for Android Compose previews.
 *
 * This extension provides Deplay device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Deplay.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Deplay get() = object {
    /** Deplay BS101_EEA */
    val BS101_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Deplay BS703_EEA */
    val BS703_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Deplay BS801 */
    val BS801 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Deplay E101GCM */
    val E101GCM = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Deplay E108GCM */
    val E108GCM = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Deplay LITE4_EEA */
    val LITE4_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Deplay PRO4 */
    val PRO4 = "spec:width=800,height=1280,unit=px,dpi=213"

}
