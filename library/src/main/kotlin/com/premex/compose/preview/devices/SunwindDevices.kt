package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sunwind device specifications for Android Compose previews.
 *
 * This extension provides Sunwind device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sunwind.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sunwind get() = object {
    /** Sunwind Sky_1123B_3G */
    val SKY_1123B_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sunwind Sky_1262C_3G */
    val SKY_1262C_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sunwind Sky_7143B_3G_SS7265PG */
    val SKY_7143B_3G_SS7265PG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Sunwind Sky_8244B_3G_SS8263PG */
    val SKY_8244B_3G_SS8263PG = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Sunwind SKY_9_A102_3G */
    val SKY_9_A102_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Sunwind SKY 9 E201 3G */
    val SKY_9_E201_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Sunwind SS1270PL */
    val SS1270PL = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Sunwind SS7238PG */
    val SS7238PG = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Sunwind SUNWIND_SKY_7_E200_3G */
    val SUNWIND_SKY_7_E200_3G = "spec:width=600,height=1024,unit=px,dpi=160"

}
