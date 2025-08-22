package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ownmobile device specifications for Android Compose previews.
 *
 * This extension provides Ownmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ownmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ownmobile get() = object {
    /** Ownmobile FUN 6 */
    val FUN_6 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ownmobile FUN 7 */
    val FUN_7 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Ownmobile OWN Smart Ö2 */
    val OWN_SMART_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Ownmobile SMART 8 */
    val SMART_8 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Ownmobile SMART 9 */
    val SMART_9 = "spec:width=720,height=1528,unit=px,dpi=280"

    /** Ownmobile Smart 9 Pro */
    val SMART_9_PRO = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Ownmobile Smart Plus Lte */
    val SMART_PLUS_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

}
