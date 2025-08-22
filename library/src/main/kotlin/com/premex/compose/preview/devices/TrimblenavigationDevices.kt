package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Trimblenavigation device specifications for Android Compose previews.
 *
 * This extension provides Trimblenavigation device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Trimblenavigation.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Trimblenavigation get() = object {
    /** Trimblenavigation MM50 */
    val MM50 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Trimblenavigation Nomad 5 */
    val NOMAD_5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Trimblenavigation PeopleNet ConnectedTablet */
    val PEOPLENET_CONNECTEDTABLET = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Trimblenavigation Ranger 5 */
    val RANGER_5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Trimblenavigation TDC100_WiFi */
    val TDC100_WIFI = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Trimblenavigation TDC600_2 */
    val TDC600_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Trimblenavigation TDC600/MM60 */
    val TDC600_MM60 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Trimblenavigation Trimble DUO */
    val TRIMBLE_DUO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Trimblenavigation Trimble TDC6 */
    val TRIMBLE_TDC6 = "spec:width=1080,height=2340,unit=px,dpi=480"

}
