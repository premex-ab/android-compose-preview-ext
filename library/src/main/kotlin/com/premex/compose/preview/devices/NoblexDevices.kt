package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Noblex device specifications for Android Compose previews.
 *
 * This extension provides Noblex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Noblex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Noblex get() = object {
    /** Noblex A50 */
    val A50 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Noblex A60 */
    val A60 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Noblex B30 */
    val B30 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Noblex Go Action */
    val GO_ACTION = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Noblex Go Move */
    val GO_MOVE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Noblex Go Street */
    val GO_STREET = "spec:width=480,height=854,unit=px,dpi=240"

    /** Noblex Go Urban */
    val GO_URBAN = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Noblex N52 */
    val N52 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Noblex N601 */
    val N601 = "spec:width=720,height=1528,unit=px,dpi=280"

    /** Noblex N62 */
    val N62 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Noblex T7A6N */
    val T7A6N = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Noblex TN11A6128 */
    val TN11A6128 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
