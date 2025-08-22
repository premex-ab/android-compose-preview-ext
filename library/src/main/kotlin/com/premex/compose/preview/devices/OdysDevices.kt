package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Odys device specifications for Android Compose previews.
 *
 * This extension provides Odys device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Odys.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Odys get() = object {
    /** Odys  FALCON_10_PLUS_3G */
    val FALCON_10_PLUS_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Odys GOAL_10_PLUS_3G */
    val GOAL_10_PLUS_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Odys JUNIOR_8_PRO_EEA */
    val JUNIOR_8_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Odys Maven_T10_pro */
    val MAVEN_T10_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Odys NoteTab_Pro */
    val NOTETAB_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Odys ODYS_SPACE_ONE_10 */
    val ODYS_SPACE_ONE_10 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Odys ODYS SPACE ONE 10SE */
    val ODYS_SPACE_ONE_10SE = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Odys PACE 10 */
    val PACE_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Odys THANOS_10 */
    val THANOS_10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Odys Titan_10_LTE */
    val TITAN_10_LTE = "spec:width=800,height=1280,unit=px,dpi=160"

}
