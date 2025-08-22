package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Medion device specifications for Android Compose previews.
 *
 * This extension provides Medion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Medion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Medion get() = object {
    /** Medion E1050X */
    val E1050X = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Medion E1051X */
    val E1051X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion E1090X */
    val E1090X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion E4507 */
    val E4507 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Medion E5005 */
    val E5005 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Medion E5006/P5006 */
    val E5006_P5006 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Medion E5008 */
    val E5008 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Medion E5504 */
    val E5504 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Medion E691X */
    val E691X = "spec:width=720,height=1280,unit=px,dpi=213"

    /** Medion LIFETAB E10316 */
    val LIFETAB_E10316 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Medion LIFETAB E10320 */
    val LIFETAB_E10320 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Medion LIFETAB E1041X */
    val LIFETAB_E1041X = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Medion LIFETAB E1042X */
    val LIFETAB_E1042X = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Medion LIFETAB E1043X */
    val LIFETAB_E1043X = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Medion LIFETAB E1053X */
    val LIFETAB_E1053X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion LIFETAB E1060X */
    val LIFETAB_E1060X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion LIFETAB E1070X */
    val LIFETAB_E1070X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion LIFETAB E1071X */
    val LIFETAB_E1071X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion LIFETAB E1081X */
    val LIFETAB_E1081X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion LIFETAB E7316 */
    val LIFETAB_E7316 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Medion LIFETAB P1075X */
    val LIFETAB_P1075X = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Medion LIFETAB P733x */
    val LIFETAB_P733X = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Medion LIFETAB P831X */
    val LIFETAB_P831X = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Medion LIFETAB P891X */
    val LIFETAB_P891X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion LIFETAB P970X */
    val LIFETAB_P970X = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Medion LIFETAB S1032X */
    val LIFETAB_S1032X = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Medion LIFETAB S1033X */
    val LIFETAB_S1033X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion LIFETAB S1034X */
    val LIFETAB_S1034X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion LIFETAB_S1036X */
    val LIFETAB_S1036X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion LIFETAB S785X */
    val LIFETAB_S785X = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Medion LIFETAB S831X */
    val LIFETAB_S831X = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Medion Media Base P740X */
    val MEDIA_BASE_P740X = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Medion P1032X */
    val P1032X = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Medion P1035X */
    val P1035X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion P1050X */
    val P1050X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion P1060X */
    val P1060X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion P1061X */
    val P1061X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion P1071X */
    val P1071X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion P1091X */
    val P1091X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion P850X */
    val P850X = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Medion P851X */
    val P851X = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Medion P852X */
    val P852X = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Medion S1035X */
    val S1035X = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Medion S5004 */
    val S5004 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Medion S5504 */
    val S5504 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Medion X1030x */
    val X1030X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion X1031X */
    val X1031X = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Medion X5520 */
    val X5520 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
