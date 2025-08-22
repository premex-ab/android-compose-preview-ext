package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tesla device specifications for Android Compose previews.
 *
 * This extension provides Tesla device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tesla.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tesla get() = object {
    /** Tesla Explr 9 */
    val EXPLR_9 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Tesla P80X_ROW */
    val P80X_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Tesla Smartphone 3.4 */
    val SMARTPHONE_3_4 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Tesla SMARTPHONE3.5 */
    val SMARTPHONE3_5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Tesla Smartphone 6.4 Lite */
    val SMARTPHONE_6_4_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Tesla Tesla_L8_2 */
    val TESLA_L8_2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Tesla Tesla Smartphone 3.3 */
    val TESLA_SMARTPHONE_3_3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Tesla Tesla Smartphone 6.3 */
    val TESLA_SMARTPHONE_6_3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Tesla Tesla Smartphone 9.1 Lite */
    val TESLA_SMARTPHONE_9_1_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Tesla Tesla_SP3.3 Lite */
    val TESLA_SP3_3_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Tesla Tesla_SP9.1 */
    val TESLA_SP9_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Tesla Tesla_SP9_2 */
    val TESLA_SP9_2 = "spec:width=720,height=1520,unit=px,dpi=320"

}
