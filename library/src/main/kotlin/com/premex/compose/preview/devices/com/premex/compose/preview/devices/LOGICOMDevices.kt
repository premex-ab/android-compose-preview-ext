package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LOGICOM device specifications for Android Compose previews.
 *
 * This extension provides LOGICOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LOGICOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LOGICOM: Any
  get() = object {
      /** DeviceSpec(manufacturer=LOGICOM, code=AERO_EEA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=AERO_EEA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AERO_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGICOM, code=COMET_EEA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=COMET_EEA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val COMET_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGICOM, code=CT1080, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=CT1080, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CT1080 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=FIVE_EEA, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=FIVE_EEA, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val FIVE_EEA = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LOGICOM, code=FLOW_EEA, width=480, height=1016, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=FLOW_EEA, width=480,
      height=1016, dpi=200, isGoogleDevice=false).code */
      val FLOW_EEA = "spec:width=480,height=1016,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LOGICOM, code=La_Tab_105, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=La_Tab_105,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LA_TAB_105 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=La_Tab_105_P_Rev2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=La_Tab_105_P_Rev2,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LA_TAB_105_P_REV2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=La_Tab_114_Rev2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=La_Tab_114_Rev2,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LA_TAB_114_REV2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=La_Tab_124_HD, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=La_Tab_124_HD,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val LA_TAB_124_HD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=La_Tab_124_HD_Plus, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=La_Tab_124_HD_Plus,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val LA_TAB_124_HD_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=La_Tab_128, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=La_Tab_128,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LA_TAB_128 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=La_Tab_72, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=La_Tab_72, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val LA_TAB_72 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=La_Tab_74_Rev2_AF, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=La_Tab_74_Rev2_AF,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LA_TAB_74_REV2_AF = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=La_Tab_74_Rev2_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=La_Tab_74_Rev2_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LA_TAB_74_REV2_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=La_Tab_75, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=La_Tab_75, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val LA_TAB_75 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=La_Tab_Link_73, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=La_Tab_Link_73,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LA_TAB_LINK_73 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=Logikids_10, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=Logikids_10,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LOGIKIDS_10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=LOGIKIDS_11P, width=800, height=1280, dpi=245,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=LOGIKIDS_11P,
      width=800, height=1280, dpi=245, isGoogleDevice=false).code */
      val LOGIKIDS_11P = "spec:width=800,height=1280,unit=px,dpi=245"

      /** DeviceSpec(manufacturer=LOGICOM, code=LOGIKIDS_5_Rev2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=LOGIKIDS_5_Rev2,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LOGIKIDS_5_REV2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=LOGIKIDS_5_Rev2_AF, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=LOGIKIDS_5_Rev2_AF,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val LOGIKIDS_5_REV2_AF = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=LUNAR_EEA, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=LUNAR_EEA, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val LUNAR_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGICOM, code=M_BOT_TAB_10, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=M_BOT_TAB_10,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val M_BOT_TAB_10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=M_bot_tab_1150, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=M_bot_tab_1150,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val M_BOT_TAB_1150 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGICOM, code=SENSE_EEA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=SENSE_EEA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SENSE_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGICOM, code=SMART_PRO_EEA, width=720, height=1600, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=SMART_PRO_EEA,
      width=720, height=1600, dpi=220, isGoogleDevice=false).code */
      val SMART_PRO_EEA = "spec:width=720,height=1600,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=LOGICOM, code=Tab_Stand_Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=Tab_Stand_Pro,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_STAND_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LOGICOM, code=TAB_STAND_PRO_2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGICOM, code=TAB_STAND_PRO_2,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB_STAND_PRO_2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
