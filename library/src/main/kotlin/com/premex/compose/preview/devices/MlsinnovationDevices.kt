package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mlsinnovation device specifications for Android Compose previews.
 *
 * This extension provides Mlsinnovation device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mlsinnovation.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mlsinnovation get() = object {
    /** Mlsinnovation iQ1060M */
    val IQ1060M = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mlsinnovation iQ1568 */
    val IQ1568 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Mlsinnovation iQ8011 */
    val IQ8011 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Mlsinnovation iQD10S */
    val IQD10S = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Mlsinnovation iQL550 */
    val IQL550 = "spec:width=540,height=1132,unit=px,dpi=240"

    /** Mlsinnovation iQL626 */
    val IQL626 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Mlsinnovation iQM960L */
    val IQM960L = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mlsinnovation iQN700 */
    val IQN700 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Mlsinnovation iQS1001 */
    val IQS1001 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mlsinnovation IQS805 */
    val IQS805 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mlsinnovation iQT1161 */
    val IQT1161 = "spec:width=1080,height=1920,unit=px,dpi=280"

    /** Mlsinnovation iQW511T */
    val IQW511T = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Mlsinnovation iQW608 */
    val IQW608 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mlsinnovation iQW626 */
    val IQW626 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Mlsinnovation PTB7QSG_3G */
    val PTB7QSG_3G = "spec:width=720,height=1280,unit=px,dpi=320"

}
