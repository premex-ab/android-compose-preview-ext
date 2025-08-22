package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Digit device specifications for Android Compose previews.
 *
 * This extension provides Digit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Digit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Digit get() = object {
    /** Digit Digit_Glory */
    val DIGIT_GLORY = "spec:width=480,height=854,unit=px,dpi=240"

    /** Digit DIGIT INFINITY  */
    val DIGIT_INFINITY = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Digit Digitplay1 */
    val DIGITPLAY1 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Digit NOTE 14 */
    val NOTE_14 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Digit NOTE 20 */
    val NOTE_20 = "spec:width=720,height=1612,unit=px,dpi=280"

}
