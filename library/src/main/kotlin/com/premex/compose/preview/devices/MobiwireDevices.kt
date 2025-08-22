package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mobiwire device specifications for Android Compose previews.
 *
 * This extension provides Mobiwire device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mobiwire.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mobiwire get() = object {
    /** Mobiwire Airtel Imagine */
    val AIRTEL_IMAGINE = "spec:width=480,height=854,unit=px,dpi=200"

    /** Mobiwire Altice E55 */
    val ALTICE_E55 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Mobiwire ALTICE S35 */
    val ALTICE_S35 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Mobiwire Benin */
    val BENIN = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Mobiwire Celtiis Smart 1 */
    val CELTIIS_SMART_1 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Mobiwire CHAT */
    val CHAT = "spec:width=576,height=1152,unit=px,dpi=220"

    /** Mobiwire H5111 */
    val H5111 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Mobiwire H5111L */
    val H5111L = "spec:width=480,height=854,unit=px,dpi=200"

    /** Mobiwire H6682_VDC_TZ */
    val H6682_VDC_TZ = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Mobiwire H67A1 */
    val H67A1 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Mobiwire Hawk from EE */
    val HAWK_FROM_EE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Mobiwire Hotah */
    val HOTAH = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Mobiwire IKOSORA+ */
    val IKOSORA = "spec:width=480,height=854,unit=px,dpi=200"

    /** Mobiwire Éɖjròmi */
    val JR_MI = "spec:width=480,height=854,unit=px,dpi=200"

    /** Mobiwire Kicka 4 Plus */
    val KICKA_4_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Mobiwire Kicka 5 */
    val KICKA_5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mobiwire Kicka 5 Plus */
    val KICKA_5_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mobiwire Kicka 5 Plus 4G */
    val KICKA_5_PLUS_4G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Mobiwire Kicka6 */
    val KICKA6 = "spec:width=720,height=1480,unit=px,dpi=280"

    /** Mobiwire Kicka Zoom */
    val KICKA_ZOOM = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mobiwire MobiWire Halona */
    val MOBIWIRE_HALONA = "spec:width=320,height=480,unit=px,dpi=160"

    /** Mobiwire Mobiwire Verda */
    val MOBIWIRE_VERDA = "spec:width=480,height=854,unit=px,dpi=200"

    /** Mobiwire S26 */
    val S26 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Mobiwire Smart C11 */
    val SMART_C11 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Mobiwire Smart E11 */
    val SMART_E11 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mobiwire Smart E25 */
    val SMART_E25 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Mobiwire Smart N11 */
    val SMART_N11 = "spec:width=540,height=1132,unit=px,dpi=240"

    /** Mobiwire Smart N12 */
    val SMART_N12 = "spec:width=444,height=960,unit=px,dpi=200"

    /** Mobiwire Smart P24 */
    val SMART_P24 = "spec:width=720,height=1560,unit=px,dpi=280"

    /** Mobiwire SmartT23 */
    val SMARTT23 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mobiwire Smart V25 */
    val SMART_V25 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Mobiwire STARSHINE 5 */
    val STARSHINE_5 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Mobiwire STARXTREM 5 */
    val STARXTREM_5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Mobiwire V Lite 2 */
    val V_LITE_2 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Mobiwire Vodafone Lite 4G */
    val VODAFONE_LITE_4G = "spec:width=480,height=960,unit=px,dpi=200"

    /** Mobiwire Vodafone Pro 4G */
    val VODAFONE_PRO_4G = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mobiwire Vodafone Smart 4G */
    val VODAFONE_SMART_4G = "spec:width=444,height=960,unit=px,dpi=200"

    /** Mobiwire V Pro 2 4G */
    val V_PRO_2_4G = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Mobiwire V Smart 2 */
    val V_SMART_2 = "spec:width=720,height=1560,unit=px,dpi=280"

}
