package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Idata device specifications for Android Compose previews.
 *
 * This extension provides Idata device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Idata.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Idata get() = object {
    /** Idata iData_50 */
    val IDATA_50 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Idata iData i3 */
    val IDATA_I3 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Idata iData K1 */
    val IDATA_K1 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Idata iData K3 Pro */
    val IDATA_K3_PRO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Idata iData P1 mini */
    val IDATA_P1_MINI = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Idata iData T1 */
    val IDATA_T1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Idata iData T1 Pro */
    val IDATA_T1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Idata iData T2 */
    val IDATA_T2 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Idata  iData T3 Pro */
    val IDATA_T3_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Idata K3S */
    val K3S = "spec:width=480,height=800,unit=px,dpi=240"

    /** Idata K8 */
    val K8 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Idata T1UHF */
    val T1UHF = "spec:width=720,height=1440,unit=px,dpi=320"

}
