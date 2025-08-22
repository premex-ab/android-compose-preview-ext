package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Incar device specifications for Android Compose previews.
 *
 * This extension provides Incar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Incar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Incar get() = object {
    /** Incar E38_RU */
    val E38_RU = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Incar 	TL65611S01 */
    val TL65611S01 = "spec:width=1200,height=2000,unit=px,dpi=320"

}
