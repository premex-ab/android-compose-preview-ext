package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dish device specifications for Android Compose previews.
 *
 * This extension provides Dish device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dish.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dish get() = object {
    /** Dish Celero3 5G+ */
    val CELERO3_5G = "spec:width=1080,height=2460,unit=px,dpi=400"

    /** Dish Celero3 5G */
    val CELERO3_5G_720X1600 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Dish Celero 5G */
    val CELERO_5G = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Dish Celero 5G 2.0 */
    val CELERO_5G_2_0 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Dish Celero5G SC */
    val CELERO5G_SC = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Dish CSSL104DBL16 */
    val CSSL104DBL16 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Dish EU001 */
    val EU001 = "spec:width=480,height=800,unit=px,dpi=200"

    /** Dish SL201D */
    val SL201D = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Dish Summit 5G */
    val SUMMIT_5G = "spec:width=720,height=1612,unit=px,dpi=280"

}
