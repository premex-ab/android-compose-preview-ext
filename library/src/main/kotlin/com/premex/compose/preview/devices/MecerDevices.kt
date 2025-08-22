package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mecer device specifications for Android Compose previews.
 *
 * This extension provides Mecer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mecer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mecer get() = object {
    /** Mecer DX10-66 */
    val DX10_66 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Mecer DX10-66-LTE */
    val DX10_66_LTE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mecer M17QF6_3G */
    val M17QF6_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mecer  M17QF6-3Gplus  */
    val M17QF6_3GPLUS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mecer M17QF6_4G */
    val M17QF6_4G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mecer M17QF7_4G */
    val M17QF7_4G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mecer M76QF6 */
    val M76QF6 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Mecer M77QF6 */
    val M77QF6 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Mecer M86Q9-3G */
    val M86Q9_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mecer MF716 */
    val MF716 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mecer MW16Q9-3G */
    val MW16Q9_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mecer TF10EA2 */
    val TF10EA2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mecer TF10MK1 */
    val TF10MK1 = "spec:width=800,height=1280,unit=px,dpi=160"

}
