package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ruio device specifications for Android Compose previews.
 *
 * This extension provides Ruio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ruio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ruio get() = object {
    /** Ruio A870 */
    val A870 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Ruio Blitz */
    val BLITZ = "spec:width=576,height=1280,unit=px,dpi=240"

    /** Ruio Cola 4G */
    val COLA_4G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ruio Cola Plus 4G */
    val COLA_PLUS_4G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ruio Ruio_i7Ultra */
    val RUIO_I7ULTRA = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Ruio RUIO_S518 */
    val RUIO_S518 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ruio RUIO S5506 */
    val RUIO_S5506 = "spec:width=540,height=1132,unit=px,dpi=240"

    /** Ruio  RUIO S6518 */
    val RUIO_S6518 = "spec:width=540,height=1200,unit=px,dpi=240"

    /** Ruio S5006 */
    val S5006 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ruio S6501 */
    val S6501 = "spec:width=540,height=1200,unit=px,dpi=240"

    /** Ruio S6506 */
    val S6506 = "spec:width=720,height=1600,unit=px,dpi=320"

}
