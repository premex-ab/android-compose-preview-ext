package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * F2mobile device specifications for Android Compose previews.
 *
 * This extension provides F2mobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.F2mobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.F2mobile get() = object {
    /** F2mobile C8Finger */
    val C8FINGER = "spec:width=480,height=800,unit=px,dpi=240"

    /** F2mobile F2 F80s_plus */
    val F2_F80S_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** F2mobile F2_LT5216 */
    val F2_LT5216 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** F2mobile i8_ROKR */
    val I8_ROKR = "spec:width=480,height=960,unit=px,dpi=220"

    /** F2mobile LT18 */
    val LT18 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** F2mobile Z8POCKET */
    val Z8POCKET = "spec:width=480,height=960,unit=px,dpi=240"

}
