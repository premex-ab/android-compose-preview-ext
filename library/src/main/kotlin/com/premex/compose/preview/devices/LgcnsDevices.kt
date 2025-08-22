package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lgcns device specifications for Android Compose previews.
 *
 * This extension provides Lgcns device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lgcns.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lgcns get() = object {
    /** Lgcns LPT_200AR */
    val LPT_200AR = "spec:width=800,height=1280,unit=px,dpi=213"

}
