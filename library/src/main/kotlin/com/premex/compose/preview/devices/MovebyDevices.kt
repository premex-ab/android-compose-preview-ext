package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Moveby device specifications for Android Compose previews.
 *
 * This extension provides Moveby device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Moveby.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Moveby get() = object {
    /** Moveby LINNEX */
    val LINNEX = "spec:width=720,height=1280,unit=px,dpi=320"

}
