package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ecs device specifications for Android Compose previews.
 *
 * This extension provides Ecs device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ecs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ecs get() = object {
    /** Ecs RealPad MA7BX2 */
    val REALPAD_MA7BX2 = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Ecs TF10EA2 */
    val TF10EA2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ecs TP10RA1 */
    val TP10RA1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ecs TR10CS1 */
    val TR10CS1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ecs TU11MK2 */
    val TU11MK2 = "spec:width=800,height=1280,unit=px,dpi=160"

}
