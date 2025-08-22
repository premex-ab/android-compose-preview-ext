package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Apolosign device specifications for Android Compose previews.
 *
 * This extension provides Apolosign device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Apolosign.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Apolosign get() = object {
    /** Apolosign DigitalCalendar */
    val DIGITALCALENDAR = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Apolosign elcnw tablet */
    val ELCNW_TABLET = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Apolosign EM101A */
    val EM101A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Apolosign EM101C */
    val EM101C = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Apolosign EM103A */
    val EM103A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Apolosign EP103B */
    val EP103B = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Apolosign EP1095T_EEA */
    val EP1095T_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Apolosign K109A */
    val K109A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Apolosign K109_Pro */
    val K109_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Apolosign K709A */
    val K709A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Apolosign Packgo */
    val PACKGO = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Apolosign WF2189T */
    val WF2189T = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Apolosign WF2489T */
    val WF2489T = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Apolosign  WF3289T  */
    val WF3289T = "spec:width=2160,height=3840,unit=px,dpi=480"

}
