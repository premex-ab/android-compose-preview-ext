package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Qilive device specifications for Android Compose previews.
 *
 * This extension provides Qilive device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Qilive.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Qilive get() = object {
    /** Qilive Q10S55IN4G2 */
    val Q10S55IN4G2 = "spec:width=640,height=1280,unit=px,dpi=260"

    /** Qilive Q10T10INP */
    val Q10T10INP = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Qilive Q1-21 */
    val Q1_21 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Qilive Q8S5IN4GP */
    val Q8S5IN4GP = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Qilive QT19071 */
    val QT19071 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Qilive QT19101 */
    val QT19101 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Qilive QT19101HV */
    val QT19101HV = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Qilive QT19101K */
    val QT19101K = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Qilive QT201101L */
    val QT201101L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Qilive QT2108BP */
    val QT2108BP = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Qilive QT2110BP */
    val QT2110BP = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Qilive QT22101B */
    val QT22101B = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Qilive QT22103BP */
    val QT22103BP = "spec:width=800,height=1332,unit=px,dpi=200"

    /** Qilive QT2308BK */
    val QT2308BK = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Qilive QT23109BP */
    val QT23109BP = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Qilive QT23126BP */
    val QT23126BP = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Qilive QT24101B */
    val QT24101B = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Qilive QT24105BP */
    val QT24105BP = "spec:width=1200,height=1920,unit=px,dpi=210"

}
