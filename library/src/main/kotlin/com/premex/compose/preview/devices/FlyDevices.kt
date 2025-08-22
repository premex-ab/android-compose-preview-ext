package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fly device specifications for Android Compose previews.
 *
 * This extension provides Fly device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fly.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fly get() = object {
    /** Fly Cirrus 13 */
    val CIRRUS_13 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Fly Cirrus 2 */
    val CIRRUS_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Fly Cirrus 3 */
    val CIRRUS_3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Fly Cirrus 4 */
    val CIRRUS_4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Fly Compact 4G */
    val COMPACT_4G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Fly Era Life 2 */
    val ERA_LIFE_2 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Fly Flylife Connect 10.1 */
    val FLYLIFE_CONNECT_10_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fly Fly View Max */
    val FLY_VIEW_MAX = "spec:width=540,height=1132,unit=px,dpi=240"

    /** Fly IQ4514 Quad */
    val IQ4514_QUAD = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Fly Nimbus 16 */
    val NIMBUS_16 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Fly Nimbus 8 */
    val NIMBUS_8 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Fly Nimbus 9 */
    val NIMBUS_9 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Fly Slimline */
    val SLIMLINE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Fly Stratus */
    val STRATUS = "spec:width=480,height=854,unit=px,dpi=240"

}
