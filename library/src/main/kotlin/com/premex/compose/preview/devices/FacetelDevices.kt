package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Facetel device specifications for Android Compose previews.
 *
 * This extension provides Facetel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Facetel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Facetel get() = object {
    /** Facetel Q10-EEA */
    val Q10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Facetel Q10-Pro */
    val Q10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Facetel Q10_T_EEA */
    val Q10_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Facetel Q10_T_US */
    val Q10_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Facetel Q10-US */
    val Q10_US = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Facetel Q3-EEA */
    val Q3_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Facetel Q3-pro */
    val Q3_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Facetel Q3pro */
    val Q3PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Facetel Q3pro_eea */
    val Q3PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Facetel Q6_US */
    val Q6_US = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Facetel Q7_EEA */
    val Q7_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Facetel Q7_US */
    val Q7_US = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Facetel W3_T_EEA */
    val W3_T_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Facetel W3_T_US */
    val W3_T_US = "spec:width=800,height=1280,unit=px,dpi=213"

}
