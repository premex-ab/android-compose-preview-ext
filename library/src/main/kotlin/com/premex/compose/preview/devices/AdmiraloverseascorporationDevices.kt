package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Admiraloverseascorporation device specifications for Android Compose previews.
 *
 * This extension provides Admiraloverseascorporation device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Admiraloverseascorporation.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Admiraloverseascorporation get() = object {
    /** Admiraloverseascorporation A2272PW4T */
    val A2272PW4T = "spec:width=672,height=1280,unit=px,dpi=160"

    /** Admiraloverseascorporation Fire */
    val FIRE = "spec:width=600,height=1024,unit=px,dpi=160"

}
