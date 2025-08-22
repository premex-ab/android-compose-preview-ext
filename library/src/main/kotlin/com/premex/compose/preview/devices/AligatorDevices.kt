package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aligator device specifications for Android Compose previews.
 *
 * This extension provides Aligator device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aligator.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aligator get() = object {
    /** Aligator ALIGATOR_RX710_EEA */
    val ALIGATOR_RX710_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Aligator ALIGATOR RX800 */
    val ALIGATOR_RX800 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Aligator ALIGATOR S5070 */
    val ALIGATOR_S5070 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Aligator ALIGATOR S5520 */
    val ALIGATOR_S5520 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Aligator ALIGATOR S5540 */
    val ALIGATOR_S5540 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Aligator 'Aligator_S5550 */
    val ALIGATOR_S5550 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Aligator ALIGATOR S6000 */
    val ALIGATOR_S6000 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Aligator Aligator_S6100 */
    val ALIGATOR_S6100 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Aligator ALIGATOR S6500 */
    val ALIGATOR_S6500 = "spec:width=540,height=1200,unit=px,dpi=240"

    /** Aligator Aligator_S6550 */
    val ALIGATOR_S6550 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Aligator Aligator_S6600 */
    val ALIGATOR_S6600 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Aligator RX600 */
    val RX600 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Aligator RX700 */
    val RX700 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Aligator RX850 */
    val RX850 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Aligator S5710 */
    val S5710 = "spec:width=720,height=1440,unit=px,dpi=320"

}
