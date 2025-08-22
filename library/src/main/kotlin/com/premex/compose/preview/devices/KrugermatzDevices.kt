package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Krugermatz device specifications for Android Compose previews.
 *
 * This extension provides Krugermatz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Krugermatz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Krugermatz get() = object {
    /** Krugermatz DRIVE_6 */
    val DRIVE_6 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Krugermatz DRIVE_6SS */
    val DRIVE_6SS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Krugermatz DRIVE 8 */
    val DRIVE_8 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Krugermatz DRIVE9 */
    val DRIVE9 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Krugermatz EAGLE_1068 */
    val EAGLE_1068 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Krugermatz EAGLE 1070 */
    val EAGLE_1070 = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Krugermatz Eagle_1074 */
    val EAGLE_1074 = "spec:width=1200,height=2000,unit=px,dpi=340"

    /** Krugermatz Eagle_1075 */
    val EAGLE_1075 = "spec:width=1200,height=2000,unit=px,dpi=340"

    /** Krugermatz Eagle_1076 */
    val EAGLE_1076 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Krugermatz Eagle_702 */
    val EAGLE_702 = "spec:width=720,height=1280,unit=px,dpi=300"

    /** Krugermatz Eagle 806 */
    val EAGLE_806 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Krugermatz Eagle_806_EEA */
    val EAGLE_806_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Krugermatz Eagle_807 */
    val EAGLE_807 = "spec:width=1200,height=1920,unit=px,dpi=360"

    /** Krugermatz EAGLE_961 */
    val EAGLE_961 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Krugermatz FLOW_11_EEA */
    val FLOW_11_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Krugermatz FLOW 5 */
    val FLOW_5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Krugermatz FLOW6Lite */
    val FLOW6LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Krugermatz FLOW7  */
    val FLOW7 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Krugermatz Flow_7S_EEA */
    val FLOW_7S_EEA = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Krugermatz Flow_9_EEA */
    val FLOW_9_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Krugermatz KM0708 */
    val KM0708 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Krugermatz KM0808 */
    val KM0808 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Krugermatz KM1008 */
    val KM1008 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Krugermatz KM1066 */
    val KM1066 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Krugermatz KM1067 */
    val KM1067 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Krugermatz KM1072 */
    val KM1072 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Krugermatz KM1073 */
    val KM1073 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Krugermatz LIVE_11_EEA */
    val LIVE_11_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Krugermatz LIVE_12_EEA */
    val LIVE_12_EEA = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Krugermatz LIVE_6plus */
    val LIVE_6PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Krugermatz LIVE_7 */
    val LIVE_7 = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Krugermatz LIVE 7S */
    val LIVE_7S = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** Krugermatz Live 8 EEA */
    val LIVE_8_EEA = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Krugermatz Live 9 EEA */
    val LIVE_9_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Krugermatz Live 9S EEA */
    val LIVE_9S_EEA = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Krugermatz MOVE_8.1 */
    val MOVE_8_1 = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Krugermatz MOVE8mini */
    val MOVE8MINI = "spec:width=480,height=960,unit=px,dpi=240"

    /** Krugermatz MOVE9 */
    val MOVE9 = "spec:width=720,height=1520,unit=px,dpi=320"

}
