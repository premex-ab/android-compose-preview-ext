package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sunmax device specifications for Android Compose previews.
 *
 * This extension provides Sunmax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sunmax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sunmax get() = object {
    /** Sunmax Model_3 */
    val MODEL_3 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Sunmax Model_6 */
    val MODEL_6 = "spec:width=720,height=1612,unit=px,dpi=300"

    /** Sunmax Model_6_4G */
    val MODEL_6_4G = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Sunmax Model_6_Pro */
    val MODEL_6_PRO = "spec:width=480,height=960,unit=px,dpi=200"

    /** Sunmax Model_6_Pro_4G */
    val MODEL_6_PRO_4G = "spec:width=480,height=960,unit=px,dpi=200"

    /** Sunmax Model_6_Pro_Max */
    val MODEL_6_PRO_MAX = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Sunmax Model 6 Pro Max 4G */
    val MODEL_6_PRO_MAX_4G = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Sunmax Model D */
    val MODEL_D = "spec:width=480,height=854,unit=px,dpi=200"

    /** Sunmax Model E */
    val MODEL_E = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Sunmax Model_E_4G */
    val MODEL_E_4G = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Sunmax Model_One */
    val MODEL_ONE = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Sunmax Model_S */
    val MODEL_S = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Sunmax Model_S_4G */
    val MODEL_S_4G = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Sunmax Model_T */
    val MODEL_T = "spec:width=480,height=854,unit=px,dpi=213"

    /** Sunmax Model_T1 */
    val MODEL_T1 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Sunmax Model_T2 */
    val MODEL_T2 = "spec:width=480,height=854,unit=px,dpi=180"

    /** Sunmax Model_X */
    val MODEL_X = "spec:width=480,height=1014,unit=px,dpi=180"

    /** Sunmax Model X 4G */
    val MODEL_X_4G = "spec:width=480,height=1014,unit=px,dpi=180"

    /** Sunmax Model_Y */
    val MODEL_Y = "spec:width=480,height=960,unit=px,dpi=213"

    /** Sunmax Sunmax Model Tab 10 */
    val SUNMAX_MODEL_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Sunmax Tab_6 */
    val TAB_6 = "spec:width=800,height=1280,unit=px,dpi=220"

}
