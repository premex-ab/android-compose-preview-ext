package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dsic device specifications for Android Compose previews.
 *
 * This extension provides Dsic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dsic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dsic get() = object {
    /** Dsic Mobilebase DS6 */
    val MOBILEBASE_DS6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Dsic Mobilebase DS60S */
    val MOBILEBASE_DS60S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Dsic RD86QE */
    val RD86QE = "spec:width=1200,height=1920,unit=px,dpi=320"

}
