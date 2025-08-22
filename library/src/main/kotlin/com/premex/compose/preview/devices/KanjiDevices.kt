package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kanji device specifications for Android Compose previews.
 *
 * This extension provides Kanji device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kanji.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kanji get() = object {
    /** Kanji KANJI_AC05 */
    val KANJI_AC05 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Kanji KJ-AC02 */
    val KJ_AC02 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Kanji KJ-AC05 */
    val KJ_AC05 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Kanji KJ_ALFARK */
    val KJ_ALFARK = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Kanji KJ-ARIZONA */
    val KJ_ARIZONA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Kanji KJ-OB02 */
    val KJ_OB02 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Kanji KJ_YUBI */
    val KJ_YUBI = "spec:width=600,height=1024,unit=px,dpi=160"

}
