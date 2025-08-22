package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pantech device specifications for Android Compose previews.
 *
 * This extension provides Pantech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pantech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pantech get() = object {
    /** Pantech IM-100GN */
    val IM_100GN = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Pantech IM-100K */
    val IM_100K = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Pantech IM-100S */
    val IM_100S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Pantech IM-A850K */
    val IM_A850K = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Pantech IM-A860K */
    val IM_A860K = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Pantech IM-A870K */
    val IM_A870K = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Pantech IM-A870S */
    val IM_A870S = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Pantech IM-A880S */
    val IM_A880S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Pantech IM-A910K */
    val IM_A910K = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Pantech IM-A910S */
    val IM_A910S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Pantech K-50 */
    val K_50 = "spec:width=800,height=1280,unit=px,dpi=310"

    /** Pantech V955 */
    val V955 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Pantech VEGA Secret Note */
    val VEGA_SECRET_NOTE = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Pantech VEGA Secret UP */
    val VEGA_SECRET_UP = "spec:width=1080,height=1920,unit=px,dpi=480"

}
