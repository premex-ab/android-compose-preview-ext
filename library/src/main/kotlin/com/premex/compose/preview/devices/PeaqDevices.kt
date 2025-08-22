package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Peaq device specifications for Android Compose previews.
 *
 * This extension provides Peaq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Peaq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Peaq get() = object {
    /** Peaq PET-1008-F464E */
    val PET_1008_F464E = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Peaq PET-1008-H332E */
    val PET_1008_H332E = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Peaq PET_10180_H464S */
    val PET_10180_H464S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Peaq PET-101-F464S */
    val PET_101_F464S = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Peaq PET-101-H232E */
    val PET_101_H232E = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Peaq PET-101-H332S-W */
    val PET_101_H332S_W = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Peaq PET-102-H232S */
    val PET_102_H232S = "spec:width=800,height=1332,unit=px,dpi=160"

    /** Peaq PET-10380-H628S */
    val PET_10380_H628S = "spec:width=800,height=1332,unit=px,dpi=160"

    /** Peaq PET-1081-H232S */
    val PET_1081_H232S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Peaq PET-1081-LH332S  */
    val PET_1081_LH332S = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Peaq PET-10980-F628E */
    val PET_10980_F628E = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Peaq PET_11080-F628S */
    val PET_11080_F628S = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Peaq PET_11080_H428S */
    val PET_11080_H428S = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Peaq PET_8040_H464S */
    val PET_8040_H464S = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Peaq PET-882-H232S */
    val PET_882_H232S = "spec:width=800,height=1280,unit=px,dpi=213"

}
