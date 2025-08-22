package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Greatasia device specifications for Android Compose previews.
 *
 * This extension provides Greatasia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Greatasia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Greatasia get() = object {
    /** Greatasia E101GC */
    val E101GC = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Greatasia E101GC4G */
    val E101GC4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Greatasia E108GC */
    val E108GC = "spec:width=800,height=1280,unit=px,dpi=170"

    /** Greatasia E10_A133_EEA */
    val E10_A133_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Greatasia E10A133_EEA */
    val E10A133_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Greatasia E700_Kids_EEA */
    val E700_KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Greatasia E720_EEA */
    val E720_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Greatasia E9863 */
    val E9863 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Greatasia Kidpad_M7 */
    val KIDPAD_M7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Greatasia Pad_M30 */
    val PAD_M30 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Greatasia TK_E109GCM */
    val TK_E109GCM = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Greatasia TK_E720_EEA */
    val TK_E720_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Greatasia TK-P1197 */
    val TK_P1197 = "spec:width=1200,height=2000,unit=px,dpi=320"

}
