package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mazespeed device specifications for Android Compose previews.
 *
 * This extension provides Mazespeed device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mazespeed.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mazespeed get() = object {
    /** Mazespeed M1582C */
    val M1582C = "spec:width=480,height=960,unit=px,dpi=213"

    /** Mazespeed M1582C MAX */
    val M1582C_MAX = "spec:width=480,height=960,unit=px,dpi=200"

    /** Mazespeed M1586K */
    val M1586K = "spec:width=480,height=960,unit=px,dpi=200"

    /** Mazespeed MS5314G */
    val MS5314G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mazespeed MS5414G */
    val MS5414G = "spec:width=480,height=854,unit=px,dpi=213"

    /** Mazespeed MS5424G */
    val MS5424G = "spec:width=480,height=960,unit=px,dpi=220"

    /** Mazespeed MS5514G */
    val MS5514G = "spec:width=480,height=960,unit=px,dpi=213"

    /** Mazespeed MS5539G */
    val MS5539G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mazespeed MS5614G */
    val MS5614G = "spec:width=480,height=960,unit=px,dpi=200"

    /** Mazespeed SSB10T323 */
    val SSB10T323 = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Mazespeed SSB8C223 */
    val SSB8C223 = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Mazespeed SSB8T323 */
    val SSB8T323 = "spec:width=800,height=1280,unit=px,dpi=240"

}
