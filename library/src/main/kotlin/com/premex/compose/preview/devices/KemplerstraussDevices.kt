package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kemplerstrauss device specifications for Android Compose previews.
 *
 * This extension provides Kemplerstrauss device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kemplerstrauss.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kemplerstrauss get() = object {
    /** Kemplerstrauss 11PRO */
    val _11PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Kemplerstrauss Alumini 3 Plus */
    val ALUMINI_3_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kemplerstrauss KEMPLER 9 */
    val KEMPLER_9 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kemplerstrauss KEMPLER_P1 */
    val KEMPLER_P1 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Kemplerstrauss KEMPLERP1_Amateur */
    val KEMPLERP1_AMATEUR = "spec:width=480,height=854,unit=px,dpi=240"

    /** Kemplerstrauss KEMPLER_P1_AMATEUR_PLUS */
    val KEMPLER_P1_AMATEUR_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Kemplerstrauss KemplerP1pro */
    val KEMPLERP1PRO = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Kemplerstrauss KEMPLER_P3 */
    val KEMPLER_P3 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Kemplerstrauss KEMPLER_X */
    val KEMPLER_X = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Kemplerstrauss ZKEMPLER */
    val ZKEMPLER = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Kemplerstrauss ZKEMPLER11 */
    val ZKEMPLER11 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Kemplerstrauss ZKEMPLER11PRO */
    val ZKEMPLER11PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Kemplerstrauss ZKEMPLER_MAX */
    val ZKEMPLER_MAX = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Kemplerstrauss ZKEMPLER_PLUS */
    val ZKEMPLER_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Kemplerstrauss ZKEMPLER PRO */
    val ZKEMPLER_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

}
