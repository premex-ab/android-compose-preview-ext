package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Twoe device specifications for Android Compose previews.
 *
 * This extension provides Twoe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Twoe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Twoe get() = object {
    /** Twoe 2E E450A 2018 */
    val _2E_E450A_2018 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Twoe F534L */
    val F534L = "spec:width=480,height=960,unit=px,dpi=240"

    /** Twoe F572L */
    val F572L = "spec:width=720,height=1440,unit=px,dpi=320"

}
