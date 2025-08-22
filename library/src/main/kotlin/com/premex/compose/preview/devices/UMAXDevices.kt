package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UMAX device specifications for Android Compose previews.
 *
 * This extension provides UMAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UMAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UMAX: Any
  get() = object {
      /** UMAX kaitak */
      val KAITAK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** UMAX seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** UMAX shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** UMAX T8_3G */
      val T8_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** UMAX tennoji */
      val TENNOJI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** UMAX VB_10Q_Plus */
      val VB_10Q_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** UMAX Visionbook_10Q_Pro */
      val VISIONBOOK_10Q_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** UMAX 10A_3G */
      val _10A_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** UMAX 10A_LTE */
      val _10A_LTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** UMAX 10C_LTE */
      val _10C_LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** UMAX 10C-LTE-A11 */
      val _10C_LTE_A11 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** UMAX 10C-PRO-LTE */
      val _10C_PRO_LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** UMAX 10L-PLUS */
      val _10L_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** UMAX 10T-LTE_EEA */
      val _10T_LTE_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** UMAX 11T-LTE-Pro_EEA */
      val _11T_LTE_PRO_EEA = "spec:width=1200,height=2000,unit=px,dpi=314"

      /** UMAX 7A_3G */
      val _7A_3G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** UMAX 7A_Plus */
      val _7A_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** UMAX 8A_Plus_eea */
      val _8A_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** UMAX 8C_LTE */
      val _8C_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** UMAX 8L_PLUS_EEA */
      val _8L_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
