package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nomi device specifications for Android Compose previews.
 *
 * This extension provides Nomi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nomi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nomi get() = object {
    /** Nomi Corsa 3 3G */
    val CORSA_3_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Nomi i5012 */
    val I5012 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nomi i5014 */
    val I5014 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nomi Nomi C070011 */
    val NOMI_C070011 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Nomi Nomi_C070034 */
    val NOMI_C070034 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nomi Nomi C101010 */
    val NOMI_C101010 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Nomi Nomi_C101034 */
    val NOMI_C101034 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nomi Nomi_C101044 */
    val NOMI_C101044 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nomi Nomi_Corsa4 3G */
    val NOMI_CORSA4_3G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nomi Nomi_Corsa 4 light 3G */
    val NOMI_CORSA_4_LIGHT_3G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nomi Nomi_Corsa4 LTE Pro */
    val NOMI_CORSA4_LTE_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nomi Nomi i5001 Plus */
    val NOMI_I5001_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Nomi Nomi i5013 */
    val NOMI_I5013 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nomi Nomi i5050 */
    val NOMI_I5050 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Nomi Nomi i5510 */
    val NOMI_I5510 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nomi Nomi i5532 */
    val NOMI_I5532 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nomi Nomi i6030 */
    val NOMI_I6030 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Nomi Nomi_Libra4 3G */
    val NOMI_LIBRA4_3G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nomi Nomi_Libra4 LTE */
    val NOMI_LIBRA4_LTE = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nomi Nomi Ultra4 3G */
    val NOMI_ULTRA4_3G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Nomi ULTRA3 3G */
    val ULTRA3_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Nomi ULTRA3 LTE */
    val ULTRA3_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Nomi ULTRA3 LTE PRO */
    val ULTRA3_LTE_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

}
