package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Telefunken device specifications for Android Compose previews.
 *
 * This extension provides Telefunken device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Telefunken.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Telefunken get() = object {
    /** Telefunken TEL-1013GIQA */
    val TEL_1013GIQA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Telefunken TEL-1014GIQ */
    val TEL_1014GIQ = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Telefunken TEL-1014GIQA */
    val TEL_1014GIQA = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Telefunken TEL-73GIQA */
    val TEL_73GIQA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Telefunken TEL-73GIQA11 */
    val TEL_73GIQA11 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Telefunken TEL-74GIQA */
    val TEL_74GIQA = "spec:width=600,height=1024,unit=px,dpi=180"

    /** Telefunken TF501_EC */
    val TF501_EC = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Telefunken TF600 */
    val TF600 = "spec:width=800,height=1280,unit=px,dpi=213"

}
