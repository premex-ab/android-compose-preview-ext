package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tabibytgo device specifications for Android Compose previews.
 *
 * This extension provides Tabibytgo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tabibytgo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tabibytgo get() = object {
    /** Tabibytgo EUTB_758_Argos */
    val EUTB_758_ARGOS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Tabibytgo EUTB_758G */
    val EUTB_758G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Tabibytgo TGO_TB1001_2R */
    val TGO_TB1001_2R = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Tabibytgo TGO_TB1001_4R */
    val TGO_TB1001_4R = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Tabibytgo TGO_TB1001_4RO */
    val TGO_TB1001_4RO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Tabibytgo TGO_TB780i */
    val TGO_TB780I = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Tabibytgo TGO_TB780ik */
    val TGO_TB780IK = "spec:width=600,height=1024,unit=px,dpi=160"

}
