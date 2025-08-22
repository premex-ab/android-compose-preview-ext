package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Plusone device specifications for Android Compose previews.
 *
 * This extension provides Plusone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Plusone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Plusone get() = object {
    /** Plusone FREETEL SAMURAI KIWAMI 2 */
    val FREETEL_SAMURAI_KIWAMI_2 = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Plusone FTJ152C */
    val FTJ152C = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Plusone FTJ161A */
    val FTJ161A = "spec:width=480,height=800,unit=px,dpi=240"

    /** Plusone Fun + */
    val FUN = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Plusone Kiwami */
    val KIWAMI = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Plusone Priori 3 */
    val PRIORI_3 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Plusone Priori3S */
    val PRIORI3S = "spec:width=720,height=1280,unit=px,dpi=320"

}
