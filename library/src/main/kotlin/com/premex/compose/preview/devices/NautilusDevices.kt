package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nautilus device specifications for Android Compose previews.
 *
 * This extension provides Nautilus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nautilus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nautilus get() = object {
    /** Nautilus NFTM-LAR */
    val NFTM_LAR = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Nautilus NFTM-MED */
    val NFTM_MED = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Nautilus NFTM-SMA */
    val NFTM_SMA = "spec:width=800,height=1280,unit=px,dpi=160"

}
