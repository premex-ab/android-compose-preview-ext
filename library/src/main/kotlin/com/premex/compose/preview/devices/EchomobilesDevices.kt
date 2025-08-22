package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Echomobiles device specifications for Android Compose previews.
 *
 * This extension provides Echomobiles device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Echomobiles.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Echomobiles get() = object {
    /** Echomobiles ECHO_HOLI */
    val ECHO_HOLI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Echomobiles FEELING */
    val FEELING = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Echomobiles FUSION */
    val FUSION = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Echomobiles HORIZON LITE */
    val HORIZON_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Echomobiles LOOK */
    val LOOK = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Echomobiles MODELABS MOBILES */
    val MODELABS_MOBILES = "spec:width=640,height=1280,unit=px,dpi=280"

    /** Echomobiles Stellar 4G */
    val STELLAR_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Echomobiles SURF */
    val SURF = "spec:width=480,height=960,unit=px,dpi=240"

}
