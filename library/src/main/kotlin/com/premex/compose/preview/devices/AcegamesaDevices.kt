package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Acegamesa device specifications for Android Compose previews.
 *
 * This extension provides Acegamesa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Acegamesa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Acegamesa get() = object {
    /** Acegamesa NEONHD/NEONGo */
    val NEONHD_NEONGO = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acegamesa One_Mundial */
    val ONE_MUNDIAL = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acegamesa SAPPHIRE_HDLT */
    val SAPPHIRE_HDLT = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acegamesa TitaniumColors */
    val TITANIUMCOLORS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Acegamesa TitaniumHD */
    val TITANIUMHD = "spec:width=600,height=1024,unit=px,dpi=160"

}
