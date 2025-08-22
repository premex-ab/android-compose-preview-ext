package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dragontouch device specifications for Android Compose previews.
 *
 * This extension provides Dragontouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dragontouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dragontouch get() = object {
    /** Dragontouch Dragon_Touch */
    val DRAGON_TOUCH = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Dragontouch DragonTouch */
    val DRAGONTOUCH = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Dragontouch KidzPad_Y88X_8 */
    val KIDZPAD_Y88X_8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dragontouch M7 */
    val M7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dragontouch MAX_10_eea */
    val MAX_10_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Dragontouch NotePad_102 */
    val NOTEPAD_102 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Dragontouch Notepad102 */
    val NOTEPAD102 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dragontouch Notepad102_EEA */
    val NOTEPAD102_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dragontouch Notepad_Go_801 */
    val NOTEPAD_GO_801 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dragontouch NotepadGo801 */
    val NOTEPADGO801 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dragontouch Notepad-K10 */
    val NOTEPAD_K10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Dragontouch NotePad_Y80 */
    val NOTEPAD_Y80 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dragontouch S10M */
    val S10M = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dragontouch T10M */
    val T10M = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Dragontouch T12M */
    val T12M = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Dragontouch T12M_EEA */
    val T12M_EEA = "spec:width=1200,height=1920,unit=px,dpi=272"

    /** Dragontouch V10 */
    val V10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dragontouch X10 */
    val X10 = "spec:width=768,height=1366,unit=px,dpi=160"

    /** Dragontouch X10 */
    val X10_800X1280 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dragontouch X7 */
    val X7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dragontouch Y80 */
    val Y80 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Dragontouch Y88X__PLUS */
    val Y88X_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Dragontouch Y88X_PRO_EEA */
    val Y88X_PRO_EEA = "spec:width=600,height=1022,unit=px,dpi=160"

}
