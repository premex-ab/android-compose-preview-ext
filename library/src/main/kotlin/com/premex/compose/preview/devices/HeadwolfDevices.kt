package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Headwolf device specifications for Android Compose previews.
 *
 * This extension provides Headwolf device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Headwolf.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Headwolf get() = object {
    /** Headwolf F2A */
    val F2A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Headwolf F3A */
    val F3A = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Headwolf F5 */
    val F5 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Headwolf F5A */
    val F5A = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Headwolf F6 */
    val F6 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Headwolf F7 */
    val F7 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Headwolf Fpad1 */
    val FPAD1 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Headwolf Fpad2 */
    val FPAD2 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Headwolf Fpad3 */
    val FPAD3 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Headwolf H3 */
    val H3 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Headwolf Hpad1 */
    val HPAD1 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Headwolf HPAD1A */
    val HPAD1A = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Headwolf Hpad2 */
    val HPAD2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Headwolf Hpad5 */
    val HPAD5 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Headwolf HPAD6 */
    val HPAD6 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Headwolf L1 */
    val L1 = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Headwolf W5 */
    val W5 = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Headwolf W5A */
    val W5A = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Headwolf  W6A  */
    val W6A = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Headwolf W7 */
    val W7 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Headwolf Wpad1 */
    val WPAD1 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Headwolf WPAD2 */
    val WPAD2 = "spec:width=1200,height=1920,unit=px,dpi=340"

}
