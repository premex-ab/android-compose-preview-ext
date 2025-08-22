package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Greenlion device specifications for Android Compose previews.
 *
 * This extension provides Greenlion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Greenlion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Greenlion get() = object {
    /** Greenlion G-10_PRO */
    val G_10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Greenlion G-10_ULTRA */
    val G_10_ULTRA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Greenlion G-20ULTRA */
    val G_20ULTRA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Greenlion G-30_ULTRA */
    val G_30_ULTRA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Greenlion G-8_PRO */
    val G_8_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

}
