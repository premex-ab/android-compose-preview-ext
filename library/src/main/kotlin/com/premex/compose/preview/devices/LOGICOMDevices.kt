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
      /** LOGICOM AERO_EEA */
      val AERO_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LOGICOM COMET_EEA */
      val COMET_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LOGICOM CT1080 */
      val CT1080 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM FIVE_EEA */
      val FIVE_EEA = "spec:width=480,height=854,unit=px,dpi=200"

      /** LOGICOM FLOW_EEA */
      val FLOW_EEA = "spec:width=480,height=1016,unit=px,dpi=200"

      /** LOGICOM La_Tab_105 */
      val LA_TAB_105 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM La_Tab_105_P_Rev2 */
      val LA_TAB_105_P_REV2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM La_Tab_114_Rev2 */
      val LA_TAB_114_REV2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM La_Tab_124_HD */
      val LA_TAB_124_HD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LOGICOM La_Tab_124_HD_Plus */
      val LA_TAB_124_HD_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LOGICOM La_Tab_128 */
      val LA_TAB_128 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM La_Tab_72 */
      val LA_TAB_72 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM La_Tab_74_Rev2_AF */
      val LA_TAB_74_REV2_AF = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM La_Tab_74_Rev2_EEA */
      val LA_TAB_74_REV2_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM La_Tab_75 */
      val LA_TAB_75 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM La_Tab_Link_73 */
      val LA_TAB_LINK_73 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM Logikids_10 */
      val LOGIKIDS_10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM LOGIKIDS_11P */
      val LOGIKIDS_11P = "spec:width=800,height=1280,unit=px,dpi=245"

      /** LOGICOM LOGIKIDS_5_Rev2 */
      val LOGIKIDS_5_REV2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM LOGIKIDS_5_Rev2_AF */
      val LOGIKIDS_5_REV2_AF = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM LUNAR_EEA */
      val LUNAR_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LOGICOM M_BOT_TAB_10 */
      val M_BOT_TAB_10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM M_bot_tab_1150 */
      val M_BOT_TAB_1150 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGICOM SENSE_EEA */
      val SENSE_EEA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LOGICOM SMART_PRO_EEA */
      val SMART_PRO_EEA = "spec:width=720,height=1600,unit=px,dpi=220"

      /** LOGICOM Tab_Stand_Pro */
      val TAB_STAND_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** LOGICOM TAB_STAND_PRO_2 */
      val TAB_STAND_PRO_2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
