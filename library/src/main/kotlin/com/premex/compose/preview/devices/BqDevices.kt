package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bq device specifications for Android Compose previews.
 *
 * This extension provides Bq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bq get() = object {
    /** Bq Aquaris A4.5 */
    val AQUARIS_A4_5 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Bq Aquaris C */
    val AQUARIS_C = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bq Aquaris E10 */
    val AQUARIS_E10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Bq Aquaris E10 3G */
    val AQUARIS_E10_3G = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Bq Aquaris E4 */
    val AQUARIS_E4 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Bq Aquaris E4.5 */
    val AQUARIS_E4_5 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Bq Aquaris E5 */
    val AQUARIS_E5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bq Aquaris E5 HD */
    val AQUARIS_E5_HD = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bq Aquaris M */
    val AQUARIS_M = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Bq Aquaris M10 */
    val AQUARIS_M10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bq Aquaris M10 4G */
    val AQUARIS_M10_4G = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Bq Aquaris M10 FHD */
    val AQUARIS_M10_FHD = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Bq Aquaris M4.5 */
    val AQUARIS_M4_5 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Bq Aquaris M5 */
    val AQUARIS_M5 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Bq Aquaris U */
    val AQUARIS_U = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bq Aquaris U2 */
    val AQUARIS_U2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bq Aquaris U2 Lite */
    val AQUARIS_U2_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bq Aquaris U lite */
    val AQUARIS_U_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bq Aquaris U Plus */
    val AQUARIS_U_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bq Aquaris V */
    val AQUARIS_V = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bq Aquaris V Plus */
    val AQUARIS_V_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Bq Aquaris Vs */
    val AQUARIS_VS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bq Aquaris Vs Plus */
    val AQUARIS_VS_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Bq Aquaris X */
    val AQUARIS_X = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Bq Aquaris X2 */
    val AQUARIS_X2 = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Bq Aquaris X2 PRO */
    val AQUARIS_X2_PRO = "spec:width=1080,height=2160,unit=px,dpi=420"

    /** Bq Aquaris X5 */
    val AQUARIS_X5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bq Aquaris X5 Plus */
    val AQUARIS_X5_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Bq Aquaris X Pro */
    val AQUARIS_X_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Bq BQ-5515L */
    val BQ_5515L = "spec:width=480,height=960,unit=px,dpi=240"

    /** Bq BQ-5516L TWIN */
    val BQ_5516L_TWIN = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Bq BQ-6016L Mercury */
    val BQ_6016L_MERCURY = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Bq Edison 3 */
    val EDISON_3 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bq Edison 3 3G */
    val EDISON_3_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bq Edison_3_mini */
    val EDISON_3_MINI = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Bq M8 */
    val M8 = "spec:width=800,height=1280,unit=px,dpi=160"

}
