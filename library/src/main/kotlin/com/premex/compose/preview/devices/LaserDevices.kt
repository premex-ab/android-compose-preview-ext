package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Laser device specifications for Android Compose previews.
 *
 * This extension provides Laser device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Laser.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Laser get() = object {
    /** Laser MID-104GB-968 */
    val MID_104GB_968 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Laser MID_1085A100 */
    val MID_1085A100 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Laser MID-1087 */
    val MID_1087 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Laser MID_1087V9 */
    val MID_1087V9 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Laser MID_1089IPSA100 */
    val MID_1089IPSA100 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Laser MID_1089IPS_EEA */
    val MID_1089IPS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Laser MID-1090IPS */
    val MID_1090IPS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Laser MID_1090IPSV9 */
    val MID_1090IPSV9 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Laser MID_1099IPS_V13 */
    val MID_1099IPS_V13 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Laser MID_785A100 */
    val MID_785A100 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Laser MID_787V9 */
    val MID_787V9 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Laser MID_789A100 */
    val MID_789A100 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Laser MID_799IPS */
    val MID_799IPS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Laser MID_799IPS_V13 */
    val MID_799IPS_V13 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Laser MID_899IPS */
    val MID_899IPS = "spec:width=800,height=1280,unit=px,dpi=180"

}
