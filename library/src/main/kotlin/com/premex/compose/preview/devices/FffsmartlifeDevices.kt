package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fffsmartlife device specifications for Android Compose previews.
 *
 * This extension provides Fffsmartlife device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fffsmartlife.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fffsmartlife get() = object {
    /** Fffsmartlife F3T10A3 */
    val F3T10A3 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Fffsmartlife F3T10B1 */
    val F3T10B1 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Fffsmartlife F3T10WD4 */
    val F3T10WD4 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Fffsmartlife F3T7B1 */
    val F3T7B1 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Fffsmartlife FFFTAB10 */
    val FFFTAB10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Fffsmartlife FFFTAB10a0 */
    val FFFTAB10A0 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fffsmartlife FFFTAB10a1 */
    val FFFTAB10A1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fffsmartlife FFFTAB10a2 */
    val FFFTAB10A2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Fffsmartlife FFFTAB10a3 */
    val FFFTAB10A3 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Fffsmartlife FFFTAB10a4 */
    val FFFTAB10A4 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Fffsmartlife FFFTAB10b0 */
    val FFFTAB10B0 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Fffsmartlife FFFTAB10b1 */
    val FFFTAB10B1 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Fffsmartlife FFFTAB10b3 */
    val FFFTAB10B3 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Fffsmartlife FFFTAB7 */
    val FFFTAB7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Fffsmartlife FFFTAB8 */
    val FFFTAB8 = "spec:width=800,height=1280,unit=px,dpi=160"

}
