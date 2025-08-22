package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Quantum device specifications for Android Compose previews.
 *
 * This extension provides Quantum device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Quantum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Quantum get() = object {
    /** Quantum Go */
    val GO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Quantum Go 2 */
    val GO_2 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Quantum i9i */
    val I9I = "spec:width=480,height=854,unit=px,dpi=213"

    /** Quantum Mini */
    val MINI = "spec:width=480,height=800,unit=px,dpi=240"

    /** Quantum Muv */
    val MUV = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Quantum MUV 3G */
    val MUV_3G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Quantum MUV PRO */
    val MUV_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Quantum MUV UP */
    val MUV_UP = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Quantum Q03 */
    val Q03 = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Quantum Qrash */
    val QRASH = "spec:width=480,height=960,unit=px,dpi=200"

    /** Quantum Q-Test */
    val Q_TEST = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Quantum Quantum Lio + */
    val QUANTUM_LIO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Quantum Quantum M */
    val QUANTUM_M = "spec:width=720,height=1440,unit=px,dpi=260"

    /** Quantum Quantum UP */
    val QUANTUM_UP = "spec:width=480,height=960,unit=px,dpi=240"

    /** Quantum Sky */
    val SKY = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Quantum V */
    val V = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Quantum You */
    val YOU = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Quantum You 2 */
    val YOU_2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Quantum You L */
    val YOU_L = "spec:width=720,height=1280,unit=px,dpi=320"

}
