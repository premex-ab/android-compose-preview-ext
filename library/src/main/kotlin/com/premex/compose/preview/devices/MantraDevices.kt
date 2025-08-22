package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mantra device specifications for Android Compose previews.
 *
 * This extension provides Mantra device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mantra.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mantra get() = object {
    /** Mantra MFSTAB */
    val MFSTAB = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mantra MFSTAB_74G */
    val MFSTAB_74G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mantra MFSTABII */
    val MFSTABII = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mantra MFSTABIV */
    val MFSTABIV = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mantra MOXA7 */
    val MOXA7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mantra MOXA71 */
    val MOXA71 = "spec:width=600,height=1024,unit=px,dpi=160"

}
