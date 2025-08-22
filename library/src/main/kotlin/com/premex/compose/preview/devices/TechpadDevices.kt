package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Techpad device specifications for Android Compose previews.
 *
 * This extension provides Techpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Techpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Techpad get() = object {
    /** Techpad 1016S */
    val _1016S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Techpad 1032 */
    val _1032 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Techpad 3G_16 */
    val _3G_16 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Techpad 816 */
    val _816 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Techpad GamePad */
    val GAMEPAD = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Techpad i700 */
    val I700 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Techpad K13 */
    val K13 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Techpad k13pro */
    val K13PRO = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Techpad M55_4G */
    val M55_4G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Techpad M5GO */
    val M5GO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Techpad NOTE_4CAM */
    val NOTE_4CAM = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Techpad Note_4CAM */
    val NOTE_4CAM_720X1520 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Techpad R10 */
    val R10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Techpad S6 */
    val S6 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Techpad S6 */
    val S6_720X1520 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Techpad S813G */
    val S813G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Techpad Tech732 */
    val TECH732 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Techpad Tech Pad */
    val TECH_PAD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Techpad TechPad_1032 */
    val TECHPAD_1032 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Techpad TechPad_1032s */
    val TECHPAD_1032S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Techpad TechPad 10Y */
    val TECHPAD_10Y = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Techpad TechPad_10Z */
    val TECHPAD_10Z = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Techpad TechPad_3Gx */
    val TECHPAD_3GX = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Techpad TechPad_716 */
    val TECHPAD_716 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Techpad TechPad 9x */
    val TECHPAD_9X = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Techpad Techpad_Kids_7 */
    val TECHPAD_KIDS_7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Techpad Tech_Pad_X10B */
    val TECH_PAD_X10B = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Techpad X11 */
    val X11 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Techpad X7 */
    val X7 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Techpad X9 */
    val X9 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Techpad Z10 */
    val Z10 = "spec:width=800,height=1280,unit=px,dpi=180"

}
