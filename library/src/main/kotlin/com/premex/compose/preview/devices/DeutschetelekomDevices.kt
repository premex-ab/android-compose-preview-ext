package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Deutschetelekom device specifications for Android Compose previews.
 *
 * This extension provides Deutschetelekom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Deutschetelekom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Deutschetelekom get() = object {
    /** Deutschetelekom T Phone */
    val T_PHONE = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Deutschetelekom T Phone 2 */
    val T_PHONE_2 = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Deutschetelekom T Phone （2023） */
    val T_PHONE_2023 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Deutschetelekom T Phone 2 Pro */
    val T_PHONE_2_PRO = "spec:width=1080,height=2436,unit=px,dpi=480"

    /** Deutschetelekom T Phone Pro */
    val T_PHONE_PRO = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Deutschetelekom T Phone Pro (2023) */
    val T_PHONE_PRO_2023 = "spec:width=720,height=1640,unit=px,dpi=280"

    /** Deutschetelekom T Tablet */
    val T_TABLET = "spec:width=1200,height=2000,unit=px,dpi=240"

}
