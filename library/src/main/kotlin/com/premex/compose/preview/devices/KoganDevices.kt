package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kogan device specifications for Android Compose previews.
 *
 * This extension provides Kogan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kogan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kogan get() = object {
    /** Kogan KAKT10164SA */
    val KAKT10164SA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Kogan KATB10128WPA */
    val KATB10128WPA = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Kogan KATB1064CGRY */
    val KATB1064CGRY = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Kogan KATB1064WGRY */
    val KATB1064WGRY = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Kogan KATB21064CPA */
    val KATB21064CPA = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Kogan KATB2P1064WPA */
    val KATB2P1064WPA = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Kogan Kogan Agora 9 */
    val KOGAN_AGORA_9 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Kogan Kogan Agora Go */
    val KOGAN_AGORA_GO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Kogan Kogan Agora XI */
    val KOGAN_AGORA_XI = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Kogan Kogan Agora XS */
    val KOGAN_AGORA_XS = "spec:width=720,height=1520,unit=px,dpi=320"

}
