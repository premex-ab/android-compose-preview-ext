package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Makinglifesimple device specifications for Android Compose previews.
 *
 * This extension provides Makinglifesimple device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Makinglifesimple.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Makinglifesimple get() = object {
    /** Makinglifesimple iQ1012N */
    val IQ1012N = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Makinglifesimple iQ1019N */
    val IQ1019N = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Makinglifesimple iQ5011_E */
    val IQ5011_E = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Makinglifesimple iQ9013_4N */
    val IQ9013_4N = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Makinglifesimple iQA27X_E */
    val IQA27X_E = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Makinglifesimple iQD700 */
    val IQD700 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Makinglifesimple iQGW516 */
    val IQGW516 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Makinglifesimple iQM960 */
    val IQM960 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Makinglifesimple iQS300 */
    val IQS300 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Makinglifesimple MLS_iQT800 */
    val MLS_IQT800 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Makinglifesimple MLS Novel 3G */
    val MLS_NOVEL_3G = "spec:width=800,height=1280,unit=px,dpi=160"

}
