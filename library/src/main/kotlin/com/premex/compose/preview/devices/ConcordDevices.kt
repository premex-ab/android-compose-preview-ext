package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Concord device specifications for Android Compose previews.
 *
 * This extension provides Concord device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Concord.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Concord get() = object {
    /** Concord A10 */
    val A10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Concord C-708 */
    val C_708 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Concord Concord M15 */
    val CONCORD_M15 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Concord Concord_RANGE_HS */
    val CONCORD_RANGE_HS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Concord Dream_Edition_C-754 */
    val DREAM_EDITION_C_754 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Concord M20 TERMINAL */
    val M20_TERMINAL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Concord Plus-7_C777 */
    val PLUS_7_C777 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Concord Plus_M19_C779 */
    val PLUS_M19_C779 = "spec:width=600,height=1024,unit=px,dpi=160"

}
