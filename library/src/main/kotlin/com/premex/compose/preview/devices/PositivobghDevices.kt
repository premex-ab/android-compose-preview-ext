package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Positivobgh device specifications for Android Compose previews.
 *
 * This extension provides Positivobgh device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Positivobgh.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Positivobgh get() = object {
    /** Positivobgh BGH Series Q10 */
    val BGH_SERIES_Q10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Positivobgh BGH Y400 */
    val BGH_Y400 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Positivobgh BGH Y700 */
    val BGH_Y700 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Positivobgh G1036 */
    val G1036 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Positivobgh G1101T */
    val G1101T = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Positivobgh KC770 */
    val KC770 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Positivobgh M840 */
    val M840 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Positivobgh Positivo BGH +Simple */
    val POSITIVO_BGH_SIMPLE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Positivobgh W750 */
    val W750 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Positivobgh Y1000 */
    val Y1000 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Positivobgh Y1010 */
    val Y1010 = "spec:width=800,height=1280,unit=px,dpi=160"

}
