package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Afrione device specifications for Android Compose previews.
 *
 * This extension provides Afrione device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Afrione.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Afrione get() = object {
    /** Afrione ChampionPro */
    val CHAMPIONPRO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Afrione CYGNUSX */
    val CYGNUSX = "spec:width=720,height=1560,unit=px,dpi=320"

}
