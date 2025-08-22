package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * How device specifications for Android Compose previews.
 *
 * This extension provides How device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.How.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.How get() = object {
    /** How 1001-G */
    val _1001_G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** How 705-G */
    val _705_G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** How 705-G Go */
    val _705_G_GO = "spec:width=600,height=1024,unit=px,dpi=213"

    /** How HT-704 */
    val HT_704 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** How HT704-G */
    val HT704_G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** How HT-705 */
    val HT_705 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** How HT-705XS */
    val HT_705XS = "spec:width=600,height=1024,unit=px,dpi=160"

}
