package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Entity device specifications for Android Compose previews.
 *
 * This extension provides Entity device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Entity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Entity get() = object {
    /** Entity ENT11QF12 */
    val ENT11QF12 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Entity ENT15QF220 */
    val ENT15QF220 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Entity ENT75QF620_EEA */
    val ENT75QF620_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Entity ENTG1011 */
    val ENTG1011 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Entity ENTITY_G10 */
    val ENTITY_G10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Entity EntityG12Pro */
    val ENTITYG12PRO = "spec:width=1600,height=2560,unit=px,dpi=240"

    /** Entity G10_2IN1_GEN2 */
    val G10_2IN1_GEN2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Entity G10XM */
    val G10XM = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Entity HW304_HW291 */
    val HW304_HW291 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
