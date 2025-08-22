package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xview device specifications for Android Compose previews.
 *
 * This extension provides Xview device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xview.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xview get() = object {
    /** Xview AMBER_KIDS */
    val AMBER_KIDS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xview Bears */
    val BEARS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xview FTB13 */
    val FTB13 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Xview Kids10 */
    val KIDS10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xview PRO_BOOK */
    val PRO_BOOK = "spec:width=1200,height=2000,unit=px,dpi=265"

    /** Xview Protab10 */
    val PROTAB10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xview PROTON_AMBER_HD */
    val PROTON_AMBER_HD = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xview Proton_Neon */
    val PROTON_NEON = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xview Q10 */
    val Q10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xview Q11 */
    val Q11 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Xview Q7 */
    val Q7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xview Quantum_Q7s */
    val QUANTUM_Q7S = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xview Quantum_Q7s_Plus */
    val QUANTUM_Q7S_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xview Tablet10_X-View */
    val TABLET10_X_VIEW = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xview Tablet7_X_View */
    val TABLET7_X_VIEW = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xview XRB15 */
    val XRB15 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Xview X-View */
    val X_VIEW = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xview X-ViewGamer10 */
    val X_VIEWGAMER10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xview X_View_Q7 */
    val X_VIEW_Q7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xview X-ViewTablet10 */
    val X_VIEWTABLET10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xview Xview_tablet_7 */
    val XVIEW_TABLET_7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Xview ZPB17 */
    val ZPB17 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
