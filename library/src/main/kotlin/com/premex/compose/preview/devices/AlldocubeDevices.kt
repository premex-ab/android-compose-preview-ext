package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Alldocube device specifications for Android Compose previews.
 *
 * This extension provides Alldocube device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Alldocube.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Alldocube get() = object {
    /** Alldocube iPlay_20 */
    val IPLAY_20 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Alldocube iPlay 20P */
    val IPLAY_20P = "spec:width=1200,height=1920,unit=px,dpi=350"

    /** Alldocube iPlay 20S */
    val IPLAY_20S = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Alldocube iPlay_30 */
    val IPLAY_30 = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Alldocube iPlay_40 */
    val IPLAY_40 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Alldocube iPlay_40_5G */
    val IPLAY_40_5G = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Alldocube iPlay 40H */
    val IPLAY_40H = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Alldocube iPlay 50 */
    val IPLAY_50 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Alldocube iPlay50 */
    val IPLAY50 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Alldocube iPlay50_Lite */
    val IPLAY50_LITE = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Alldocube iPlay50_Mini_Lite */
    val IPLAY50_MINI_LITE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Alldocube iPlay50_mini_Pro */
    val IPLAY50_MINI_PRO = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Alldocube iPlay_50_Pro */
    val IPLAY_50_PRO = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Alldocube iPlay50 Pro */
    val IPLAY50_PRO = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Alldocube iPlay 50S */
    val IPLAY_50S = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Alldocube iPlay50S */
    val IPLAY50S = "spec:width=800,height=1280,unit=px,dpi=210"

    /** Alldocube iPlay_60 */
    val IPLAY_60 = "spec:width=1200,height=2000,unit=px,dpi=360"

    /** Alldocube iPlay_60_Lite */
    val IPLAY_60_LITE = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Alldocube iPlay60_mini */
    val IPLAY60_MINI = "spec:width=800,height=1340,unit=px,dpi=213"

    /** Alldocube iPlay60_mini_Pro */
    val IPLAY60_MINI_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Alldocube iPlay 60 Pad Pro */
    val IPLAY_60_PAD_PRO = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Alldocube iPlay60_Pro */
    val IPLAY60_PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Alldocube iPlay60_S */
    val IPLAY60_S = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Alldocube  iPlay60_S_4G  */
    val IPLAY60_S_4G = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Alldocube iPlay70_mini_Turbo */
    val IPLAY70_MINI_TURBO = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Alldocube iPlay_70_mini_Ultra */
    val IPLAY_70_MINI_ULTRA = "spec:width=1600,height=2560,unit=px,dpi=340"

    /** Alldocube  iPlay_70_Pro  */
    val IPLAY_70_PRO = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Alldocube iPlay_70_S */
    val IPLAY_70_S = "spec:width=1280,height=1920,unit=px,dpi=210"

    /** Alldocube iPlay 8 Pro */
    val IPLAY_8_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Alldocube iPlay 8T */
    val IPLAY_8T = "spec:width=800,height=1280,unit=px,dpi=320"

    /** Alldocube iPlay9T */
    val IPLAY9T = "spec:width=1280,height=1920,unit=px,dpi=320"

    /** Alldocube KidzPad Pro */
    val KIDZPAD_PRO = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Alldocube kPad */
    val KPAD = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Alldocube Smile_1 */
    val SMILE_1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Alldocube Smile_X */
    val SMILE_X = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Alldocube T1021P */
    val T1021P = "spec:width=1200,height=1920,unit=px,dpi=380"

    /** Alldocube T1021T */
    val T1021T = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Alldocube T701 */
    val T701 = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Alldocube T701_X */
    val T701_X = "spec:width=720,height=1280,unit=px,dpi=300"

    /** Alldocube T806 */
    val T806 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Alldocube T806ME */
    val T806ME = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Alldocube U1005 */
    val U1005 = "spec:width=1600,height=2560,unit=px,dpi=240"

    /** Alldocube U1005E */
    val U1005E = "spec:width=1600,height=2560,unit=px,dpi=240"

    /** Alldocube U1006 */
    val U1006 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Alldocube U1006E */
    val U1006E = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Alldocube U1006H */
    val U1006H = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Alldocube U63PLUS */
    val U63PLUS = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Alldocube X game */
    val X_GAME = "spec:width=1280,height=1920,unit=px,dpi=320"

}
