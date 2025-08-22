package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dcginspiratech device specifications for Android Compose previews.
 *
 * This extension provides Dcginspiratech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dcginspiratech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dcginspiratech get() = object {
    /** Dcginspiratech DCG-N10 */
    val DCG_N10 = "spec:width=800,height=1280,unit=px,dpi=160"

}
