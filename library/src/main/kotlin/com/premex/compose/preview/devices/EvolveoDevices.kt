package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Evolveo device specifications for Android Compose previews.
 *
 * This extension provides Evolveo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Evolveo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Evolveo get() = object {
    /** Evolveo EVOLVEO StrongPhone G2 */
    val EVOLVEO_STRONGPHONE_G2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Evolveo EVOLVEO StrongPhone G4 */
    val EVOLVEO_STRONGPHONE_G4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Evolveo EVOLVEO StrongPhone G7 */
    val EVOLVEO_STRONGPHONE_G7 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Evolveo EVOLVEO StrongPhone G8 */
    val EVOLVEO_STRONGPHONE_G8 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Evolveo EVOLVEO StrongPhone G9 */
    val EVOLVEO_STRONGPHONE_G9 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Evolveo GM6 DS */
    val GM6_DS = "spec:width=720,height=1440,unit=px,dpi=320"

}
