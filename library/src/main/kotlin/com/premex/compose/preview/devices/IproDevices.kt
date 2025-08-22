package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ipro device specifications for Android Compose previews.
 *
 * This extension provides Ipro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ipro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ipro get() = object {
    /** Ipro Amber5s Plus */
    val AMBER5S_PLUS = "spec:width=480,height=960,unit=px,dpi=213"

    /** Ipro Amber5S_Pro */
    val AMBER5S_PRO = "spec:width=480,height=960,unit=px,dpi=200"

    /** Ipro Amber5S_Pro */
    val AMBER5S_PRO_480X960 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Ipro Amber7S */
    val AMBER7S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ipro Amber8 */
    val AMBER8 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Ipro Amber8S */
    val AMBER8S = "spec:width=480,height=960,unit=px,dpi=213"

    /** Ipro Amber8s_Mate */
    val AMBER8S_MATE = "spec:width=480,height=960,unit=px,dpi=213"

    /** Ipro Amber8S plus */
    val AMBER8S_PLUS = "spec:width=480,height=960,unit=px,dpi=213"

    /** Ipro Amber8s Pro */
    val AMBER8S_PRO = "spec:width=480,height=960,unit=px,dpi=213"

    /** Ipro Benny */
    val BENNY = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ipro Benny10 */
    val BENNY10 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Ipro BennyM */
    val BENNYM = "spec:width=480,height=960,unit=px,dpi=213"

    /** Ipro BEQUE7S */
    val BEQUE7S = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ipro Jade8S */
    val JADE8S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ipro Kylin_5.0S */
    val KYLIN_5_0S = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ipro MEGA */
    val MEGA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ipro Opal4S */
    val OPAL4S = "spec:width=480,height=800,unit=px,dpi=240"

    /** Ipro Ruby5S */
    val RUBY5S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ipro S100 */
    val S100 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ipro S100E */
    val S100E = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ipro S200M */
    val S200M = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ipro S300 */
    val S300 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ipro S401 */
    val S401 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Ipro S401A */
    val S401A = "spec:width=480,height=800,unit=px,dpi=240"

    /** Ipro S501 */
    val S501 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ipro S501A */
    val S501A = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ipro  S501APlus  */
    val S501APLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ipro S501Pro */
    val S501PRO = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ipro SAMBA65S */
    val SAMBA65S = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ipro Soda6S */
    val SODA6S = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Ipro X1 */
    val X1 = "spec:width=480,height=996,unit=px,dpi=240"

    /** Ipro Y100 */
    val Y100 = "spec:width=480,height=960,unit=px,dpi=240"

}
