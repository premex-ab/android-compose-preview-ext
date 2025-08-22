package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Auchan device specifications for Android Compose previews.
 *
 * This extension provides Auchan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Auchan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Auchan get() = object {
    /** Auchan LZ_890 */
    val LZ_890 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Auchan Q4T10IN */
    val Q4T10IN = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Auchan Q6T10IN */
    val Q6T10IN = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Auchan Q7T10INP */
    val Q7T10INP = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Auchan Q8S55IN4G2 */
    val Q8S55IN4G2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Auchan Q8S6IN4G */
    val Q8S6IN4G = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Auchan Q9S5IN4G */
    val Q9S5IN4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Auchan S3T10IN */
    val S3T10IN = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Auchan S5S5IN4G */
    val S5S5IN4G = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Auchan S5T10IN */
    val S5T10IN = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Auchan SP19403 */
    val SP19403 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Auchan SP19504 */
    val SP19504 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Auchan ST19101 */
    val ST19101 = "spec:width=600,height=1024,unit=px,dpi=160"

}
