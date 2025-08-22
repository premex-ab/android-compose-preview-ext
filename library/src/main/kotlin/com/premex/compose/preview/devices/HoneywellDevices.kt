package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Honeywell device specifications for Android Compose previews.
 *
 * This extension provides Honeywell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Honeywell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Honeywell get() = object {
    /** Honeywell CK62 */
    val CK62 = "spec:width=480,height=800,unit=px,dpi=213"

    /** Honeywell CK65 */
    val CK65 = "spec:width=480,height=800,unit=px,dpi=213"

    /** Honeywell CK67 */
    val CK67 = "spec:width=480,height=800,unit=px,dpi=213"

    /** Honeywell CK75 */
    val CK75 = "spec:width=480,height=640,unit=px,dpi=213"

    /** Honeywell CN80 */
    val CN80 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Honeywell CT30XP */
    val CT30XP = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Honeywell CT37 */
    val CT37 = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Honeywell CT40 */
    val CT40 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Honeywell CT40XP */
    val CT40XP = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Honeywell CT45 */
    val CT45 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Honeywell CT45 XP */
    val CT45_XP = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Honeywell CT47 */
    val CT47 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Honeywell CT50 */
    val CT50 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Honeywell CT60 */
    val CT60 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Honeywell CT70 */
    val CT70 = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Honeywell D75E */
    val D75E = "spec:width=480,height=800,unit=px,dpi=240"

    /** Honeywell Dolphin CT50 */
    val DOLPHIN_CT50 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Honeywell EDA10A */
    val EDA10A = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Honeywell EDA40 */
    val EDA40 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Honeywell EdA50 */
    val EDA50 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Honeywell EDA50K */
    val EDA50K = "spec:width=480,height=800,unit=px,dpi=240"

    /** Honeywell EDA51 */
    val EDA51 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Honeywell EDA51K */
    val EDA51K = "spec:width=480,height=800,unit=px,dpi=240"

    /** Honeywell EDA56-0 */
    val EDA56_0 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Honeywell EDA57 */
    val EDA57 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Honeywell EDA5S */
    val EDA5S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Honeywell EDA61K */
    val EDA61K = "spec:width=480,height=800,unit=px,dpi=240"

    /** Honeywell EDA70 */
    val EDA70 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Honeywell EDA71 */
    val EDA71 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Honeywell HMS-PD-X1C-3 */
    val HMS_PD_X1C_3 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Honeywell RT10A */
    val RT10A = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Honeywell Thor VM1A */
    val THOR_VM1A = "spec:width=768,height=1280,unit=px,dpi=160"

    /** Honeywell Thor VM3A */
    val THOR_VM3A = "spec:width=768,height=1024,unit=px,dpi=160"

}
