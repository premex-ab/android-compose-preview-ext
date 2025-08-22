package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Blow device specifications for Android Compose previews.
 *
 * This extension provides Blow device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Blow.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Blow get() = object {
    /** Blow BlackTAB7 */
    val BLACKTAB7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Blow BlackTab7_3G_V2 */
    val BLACKTAB7_3G_V2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Blow BlackTAB8_4G */
    val BLACKTAB8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Blow GPSTAB7_4G */
    val GPSTAB7_4G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Blow KidsTAB10_4G_EEA */
    val KIDSTAB10_4G_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Blow KidsTAB7_EEA */
    val KIDSTAB7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Blow LaserTAB10 */
    val LASERTAB10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Blow PlatinumTAB10 */
    val PLATINUMTAB10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Blow PlatinumTAB10_4G_V1 */
    val PLATINUMTAB10_4G_V1 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Blow PlatinumTAB10_4G_V2 */
    val PLATINUMTAB10_4G_V2 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Blow PlatinumTAB10_4G_V3 */
    val PLATINUMTAB10_4G_V3 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Blow PlatinumTAB10V11 */
    val PLATINUMTAB10V11 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Blow PlatinumTAB10V22 */
    val PLATINUMTAB10V22 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Blow PlatinumTAB11_4G */
    val PLATINUMTAB11_4G = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Blow PlatinumTAB8_4G */
    val PLATINUMTAB8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

}
