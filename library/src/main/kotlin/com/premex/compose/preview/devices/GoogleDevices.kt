package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Google device specifications for Android Compose previews.
 *
 * This extension provides Google device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Google.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Google get() = object {
    /** Google Emulator */
    val EMULATOR = "spec:width=1080,height=2280,unit=px,dpi=440"

    /** Google emulator */
    val EMULATOR_1080X2400 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Google gcar emulator */
    val GCAR_EMULATOR = "spec:width=1080,height=2280,unit=px,dpi=440"

    /** Google Pixel */
    val PIXEL = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Google Pixel 2 XL */
    val PIXEL_2_XL = "spec:width=1440,height=2880,unit=px,dpi=240"

    /** Google Pixel 3 */
    val PIXEL_3 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Google Pixel 3a */
    val PIXEL_3A = "spec:width=1080,height=2220,unit=px,dpi=440"

    /** Google Pixel 3a XL */
    val PIXEL_3A_XL = "spec:width=1080,height=2160,unit=px,dpi=400"

    /** Google Pixel 3 XL */
    val PIXEL_3_XL = "spec:width=1440,height=2960,unit=px,dpi=560"

    /** Google Pixel 4 */
    val PIXEL_4 = "spec:width=1080,height=2280,unit=px,dpi=440"

    /** Google Pixel 4a */
    val PIXEL_4A = "spec:width=1080,height=2340,unit=px,dpi=440"

    /** Google Pixel 4a (5G) */
    val PIXEL_4A_5G = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Google Pixel 4 XL */
    val PIXEL_4_XL = "spec:width=1440,height=3040,unit=px,dpi=560"

    /** Google Pixel 5 */
    val PIXEL_5 = "spec:width=1080,height=2340,unit=px,dpi=440"

    /** Google Pixel 5a 5G */
    val PIXEL_5A_5G = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Google Pixel 6 */
    val PIXEL_6 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Google Pixel 6a */
    val PIXEL_6A = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Google Pixel 6 Pro */
    val PIXEL_6_PRO = "spec:width=1440,height=3120,unit=px,dpi=560"

    /** Google Pixel 7 */
    val PIXEL_7 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Google Pixel 7a */
    val PIXEL_7A = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Google Pixel 7 Pro */
    val PIXEL_7_PRO = "spec:width=1440,height=3120,unit=px,dpi=560"

    /** Google Pixel 8 */
    val PIXEL_8 = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Google Pixel 8a */
    val PIXEL_8A = "spec:width=1080,height=2400,unit=px,dpi=420"

    /** Google Pixel 8 Pro */
    val PIXEL_8_PRO = "spec:width=1344,height=2992,unit=px,dpi=480"

    /** Google Pixel 9 */
    val PIXEL_9 = "spec:width=1080,height=2424,unit=px,dpi=420"

    /** Google Pixel 9a */
    val PIXEL_9A = "spec:width=1080,height=2424,unit=px,dpi=420"

    /** Google Pixel 9 Pro */
    val PIXEL_9_PRO = "spec:width=1280,height=2856,unit=px,dpi=480"

    /** Google Pixel 9 Pro Fold */
    val PIXEL_9_PRO_FOLD = "spec:width=2076,height=2152,unit=px,dpi=390"

    /** Google Pixel 9 Pro XL */
    val PIXEL_9_PRO_XL = "spec:width=1344,height=2992,unit=px,dpi=480"

    /** Google Pixel C */
    val PIXEL_C = "spec:width=1800,height=2560,unit=px,dpi=320"

    /** Google Pixel Fold */
    val PIXEL_FOLD = "spec:width=1840,height=2208,unit=px,dpi=420"

    /** Google Pixel Tablet */
    val PIXEL_TABLET = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Google Pixel XL */
    val PIXEL_XL = "spec:width=1440,height=2560,unit=px,dpi=560"

}
