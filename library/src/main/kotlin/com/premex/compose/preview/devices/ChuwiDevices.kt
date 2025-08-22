package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Chuwi device specifications for Android Compose previews.
 *
 * This extension provides Chuwi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Chuwi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Chuwi get() = object {
    /** Chuwi CHUWI */
    val CHUWI = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Chuwi Hi10_XPro */
    val HI10_XPRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Chuwi Hi10_XPro_Pad */
    val HI10_XPRO_PAD = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Chuwi Hi10_XPro_Pad_EEA */
    val HI10_XPRO_PAD_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Chuwi Hi9 */
    val HI9 = "spec:width=1600,height=2560,unit=px,dpi=360"

    /** Chuwi Hi9Pro */
    val HI9PRO = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Chuwi HiPad 11 */
    val HIPAD_11 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Chuwi HiPad-Air-EEA */
    val HIPAD_AIR_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Chuwi HiPad Max */
    val HIPAD_MAX = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Chuwi HiPadPlus-3_ROW */
    val HIPADPLUS_3_ROW = "spec:width=1600,height=2176,unit=px,dpi=320"

    /** Chuwi HiPad_Pro */
    val HIPAD_PRO = "spec:width=1212,height=1940,unit=px,dpi=320"

    /** Chuwi HiPadPro */
    val HIPADPRO = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Chuwi HipadX_eea_1 */
    val HIPADX_EEA_1 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Chuwi HiPad_XPro_EEA */
    val HIPAD_XPRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Chuwi HiPad_XPro_ROW13 */
    val HIPAD_XPRO_ROW13 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Chuwi HiPadX_ROW */
    val HIPADX_ROW = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Chuwi Surpad */
    val SURPAD = "spec:width=1200,height=1920,unit=px,dpi=240"

}
