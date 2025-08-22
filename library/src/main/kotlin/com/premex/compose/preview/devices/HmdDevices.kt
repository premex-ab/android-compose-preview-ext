package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hmd device specifications for Android Compose previews.
 *
 * This extension provides Hmd device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hmd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hmd get() = object {
    /** Hmd HMD Aura */
    val HMD_AURA = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Hmd HMD CREST */
    val HMD_CREST = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Hmd HMD CREST MAX */
    val HMD_CREST_MAX = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Hmd HMD Fusion X1 */
    val HMD_FUSION_X1 = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Hmd HMD KEY */
    val HMD_KEY = "spec:width=576,height=1280,unit=px,dpi=213"

    /** Hmd HMD Pulse */
    val HMD_PULSE = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Hmd HMD Skyline */
    val HMD_SKYLINE = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Hmd HMD T21 */
    val HMD_T21 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Hmd HMD Vibe */
    val HMD_VIBE = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Hmd HMD XR21 */
    val HMD_XR21 = "spec:width=1080,height=2400,unit=px,dpi=400"

    /** Hmd M-KOPA X20 */
    val M_KOPA_X20 = "spec:width=720,height=1612,unit=px,dpi=280"

}
