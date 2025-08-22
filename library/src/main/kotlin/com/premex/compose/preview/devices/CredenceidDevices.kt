package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Credenceid device specifications for Android Compose previews.
 *
 * This extension provides Credenceid device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Credenceid.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Credenceid get() = object {
    /** Credenceid CredenceECO */
    val CREDENCEECO = "spec:width=720,height=1280,unit=px,dpi=320"

}
