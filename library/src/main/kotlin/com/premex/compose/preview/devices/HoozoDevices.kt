package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hoozo device specifications for Android Compose previews.
 *
 * This extension provides Hoozo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hoozo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hoozo get() = object {
    /** Hoozo F13 */
    val F13 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hoozo F13_EEA */
    val F13_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hoozo HZ0010 */
    val HZ0010 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Hoozo HZ0010J */
    val HZ0010J = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Hoozo HZ0011 */
    val HZ0011 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Hoozo HZ1012 */
    val HZ1012 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hoozo KTLA133 */
    val KTLA133 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hoozo MA768 */
    val MA768 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hoozo MBR05 */
    val MBR05 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hoozo MBR05_EEA */
    val MBR05_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hoozo MID */
    val MID = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hoozo MR768 */
    val MR768 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hoozo MZ10863W */
    val MZ10863W = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hoozo MZS10 */
    val MZS10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Hoozo T10A */
    val T10A = "spec:width=1200,height=2000,unit=px,dpi=180"

    /** Hoozo YK_P30 */
    val YK_P30 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hoozo YK_P30_EEA */
    val YK_P30_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
