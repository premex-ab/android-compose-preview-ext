package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Imoinmyopinion device specifications for Android Compose previews.
 *
 * This extension provides Imoinmyopinion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Imoinmyopinion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Imoinmyopinion get() = object {
    /** Imoinmyopinion IMO Q2 Plus */
    val IMO_Q2_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Imoinmyopinion IMO Q2 Pro */
    val IMO_Q2_PRO = "spec:width=480,height=800,unit=px,dpi=213"

    /** Imoinmyopinion IMO Q3 Plus */
    val IMO_Q3_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Imoinmyopinion IMO Q4 Pro */
    val IMO_Q4_PRO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Imoinmyopinion IMO Q5 */
    val IMO_Q5 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Imoinmyopinion IMO S2 */
    val IMO_S2 = "spec:width=720,height=1280,unit=px,dpi=320"

}
