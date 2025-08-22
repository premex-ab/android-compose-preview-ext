package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mediacom device specifications for Android Compose previews.
 *
 * This extension provides Mediacom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mediacom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mediacom get() = object {
    /** Mediacom 10edge */
    val _10EDGE = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Mediacom 1AEC */
    val _1AEC = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom 1AY */
    val _1AY = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom 1AZ2T */
    val _1AZ2T = "spec:width=1200,height=1920,unit=px,dpi=300"

    /** Mediacom 1AZ_EEA */
    val _1AZ_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom 1BEC_eea */
    val _1BEC_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom 1BY */
    val _1BY = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom 1CY_EEA */
    val _1CY_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom 1DY */
    val _1DY = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom 1DY4G_eea */
    val _1DY4G_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom 1HY4G */
    val _1HY4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom 1IY4G */
    val _1IY4G = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Mediacom 7BY */
    val _7BY = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mediacom 7DY_EEA */
    val _7DY_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mediacom 8AY */
    val _8AY = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom 8BY_EEA */
    val _8BY_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom 8CY */
    val _8CY = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom 8DY */
    val _8DY = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mediacom AZIMUT_4 */
    val AZIMUT_4 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Mediacom M-PPxS5 */
    val M_PPXS5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Mediacom M-PPxS7 */
    val M_PPXS7 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Mediacom M-SP10HXxH */
    val M_SP10HXXH = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom M-SP10KID */
    val M_SP10KID = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mediacom M-SP10MXHA */
    val M_SP10MXHA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom M-SP10MXHL */
    val M_SP10MXHL = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom M-SP1AGO3G */
    val M_SP1AGO3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom M-SP1AZ2TW_EEA */
    val M_SP1AZ2TW_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Mediacom M-SP1AZ3_EEA */
    val M_SP1AZ3_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Mediacom M-SP1AZ3L */
    val M_SP1AZ3L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mediacom M-SP1AZ3L2 */
    val M_SP1AZ3L2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mediacom M-SP1AZ3P */
    val M_SP1AZ3P = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Mediacom M-SP1EY */
    val M_SP1EY = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mediacom M-SP1X10 */
    val M_SP1X10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mediacom M-SP7HXAH */
    val M_SP7HXAH = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mediacom M-SP7xGO3G */
    val M_SP7XGO3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mediacom M-SP8EY */
    val M_SP8EY = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mediacom M-SP8GY */
    val M_SP8GY = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Mediacom M-SP8KID */
    val M_SP8KID = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mediacom SP1AZ4_L */
    val SP1AZ4_L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mediacom SP1AZ4_P */
    val SP1AZ4_P = "spec:width=1200,height=2000,unit=px,dpi=280"

}
