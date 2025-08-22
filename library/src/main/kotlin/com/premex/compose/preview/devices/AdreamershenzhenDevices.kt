package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Adreamershenzhen device specifications for Android Compose previews.
 *
 * This extension provides Adreamershenzhen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Adreamershenzhen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Adreamershenzhen get() = object {
    /** Adreamershenzhen KidsPad10X */
    val KIDSPAD10X = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Adreamershenzhen LeoPad 10X */
    val LEOPAD_10X = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Adreamershenzhen LeoPad20 */
    val LEOPAD20 = "spec:width=800,height=1280,unit=px,dpi=160"

}
