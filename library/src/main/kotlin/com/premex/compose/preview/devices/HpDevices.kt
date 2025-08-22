package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hp device specifications for Android Compose previews.
 *
 * This extension provides Hp device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hp get() = object {
    /** Hp 10 */
    val _10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hp 10 Plus */
    val _10_PLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Hp 7.1 */
    val _7_1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hp 7 G2 */
    val _7_G2 = "spec:width=720,height=1280,unit=px,dpi=160"

    /** Hp 7 Plus */
    val _7_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hp 7 Tablet */
    val _7_TABLET = "spec:width=552,height=1024,unit=px,dpi=160"

    /** Hp 7 Voice Tab */
    val _7_VOICE_TAB = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hp 8 */
    val _8 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Hp 8 G2 */
    val _8_G2 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Hp HP Engage One Essential All-in-One System */
    val HP_ENGAGE_ONE_ESSENTIAL_ALL_IN_ONE_SYSTEM = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Hp HP Engage One Pro AIO System */
    val HP_ENGAGE_ONE_PRO_AIO_SYSTEM = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Hp Pro 8 Tablet with Voice */
    val PRO_8_TABLET_WITH_VOICE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hp Pro Slate 10 EE G1 */
    val PRO_SLATE_10_EE_G1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hp Pro Slate 8 */
    val PRO_SLATE_8 = "spec:width=1536,height=2048,unit=px,dpi=320"

    /** Hp Slate 10 HD */
    val SLATE_10_HD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hp Slate 17 */
    val SLATE_17 = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Hp Slate21 */
    val SLATE21 = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Hp Slate 21 Pro */
    val SLATE_21_PRO = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Hp Slate 7 */
    val SLATE_7 = "spec:width=600,height=976,unit=px,dpi=160"

    /** Hp Slate7 Plus */
    val SLATE7_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hp SlateBook 10 x2 PC */
    val SLATEBOOK_10_X2_PC = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Hp Voice Tab 7 */
    val VOICE_TAB_7 = "spec:width=800,height=1280,unit=px,dpi=213"

}
