package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ilamobile device specifications for Android Compose previews.
 *
 * This extension provides Ilamobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ilamobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ilamobile get() = object {
    /** Ilamobile C3 */
    val C3 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ilamobile E1 Plus */
    val E1_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ilamobile E3 */
    val E3 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ilamobile ILA C1 */
    val ILA_C1 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ilamobile ILA E1 */
    val ILA_E1 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ilamobile ILA R1 */
    val ILA_R1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ilamobile iLA Silk */
    val ILA_SILK = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ilamobile ILA_X1 */
    val ILA_X1 = "spec:width=720,height=1498,unit=px,dpi=320"

    /** Ilamobile ILA X2 */
    val ILA_X2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ilamobile ILA_X3 */
    val ILA_X3 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Ilamobile R1 Lite */
    val R1_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

}
