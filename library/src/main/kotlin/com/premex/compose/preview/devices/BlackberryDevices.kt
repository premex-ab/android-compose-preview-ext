package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Blackberry device specifications for Android Compose previews.
 *
 * This extension provides Blackberry device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Blackberry.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Blackberry get() = object {
    /** Blackberry Aurora */
    val AURORA = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Blackberry BlackBerry Evolve */
    val BLACKBERRY_EVOLVE = "spec:width=1080,height=2160,unit=px,dpi=400"

    /** Blackberry Blackberry Evolve X */
    val BLACKBERRY_EVOLVE_X = "spec:width=1080,height=2160,unit=px,dpi=400"

    /** Blackberry BlackBerry KEY2 */
    val BLACKBERRY_KEY2 = "spec:width=1080,height=1620,unit=px,dpi=420"

    /** Blackberry BlackBerry KEY2 LE */
    val BLACKBERRY_KEY2_LE = "spec:width=1080,height=1620,unit=px,dpi=420"

    /** Blackberry BlackBerry MOTION */
    val BLACKBERRY_MOTION = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Blackberry DTEK50 */
    val DTEK50 = "spec:width=1080,height=1920,unit=px,dpi=420"

    /** Blackberry DTEK60 */
    val DTEK60 = "spec:width=1440,height=2560,unit=px,dpi=560"

    /** Blackberry KEYone */
    val KEYONE = "spec:width=1080,height=1620,unit=px,dpi=420"

    /** Blackberry PRIV by BlackBerry */
    val PRIV_BY_BLACKBERRY = "spec:width=1440,height=2560,unit=px,dpi=560"

}
