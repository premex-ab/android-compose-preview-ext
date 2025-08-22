package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Unophone device specifications for Android Compose previews.
 *
 * This extension provides Unophone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Unophone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Unophone get() = object {
    /** Unophone NewPad 10 */
    val NEWPAD_10 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Unophone Premier5 */
    val PREMIER5 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Unophone Premier5Max */
    val PREMIER5MAX = "spec:width=480,height=960,unit=px,dpi=200"

    /** Unophone Premier_ProA */
    val PREMIER_PROA = "spec:width=480,height=960,unit=px,dpi=213"

    /** Unophone Premier_Pro_B */
    val PREMIER_PRO_B = "spec:width=480,height=960,unit=px,dpi=213"

    /** Unophone UNO_Prime6 */
    val UNO_PRIME6 = "spec:width=480,height=960,unit=px,dpi=213"

}
