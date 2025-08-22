package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Olax device specifications for Android Compose previews.
 *
 * This extension provides Olax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Olax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Olax get() = object {
    /** Olax Magic_Q1 */
    val MAGIC_Q1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Olax Magic_Q8 */
    val MAGIC_Q8 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Olax Ocean_F8 */
    val OCEAN_F8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Olax Ocean K8  */
    val OCEAN_K8 = "spec:width=800,height=1280,unit=px,dpi=280"

    /** Olax Ocean_K8_Pro */
    val OCEAN_K8_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

}
