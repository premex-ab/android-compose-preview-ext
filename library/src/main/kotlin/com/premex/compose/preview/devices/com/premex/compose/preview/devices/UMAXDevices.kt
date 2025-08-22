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
      /** DeviceSpec(manufacturer=UMAX, code=kaitak, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=kaitak, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KAITAK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMAX, code=seocho, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=seocho, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMAX, code=shilin, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=shilin, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UMAX, code=T8_3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=T8_3G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMAX, code=tennoji, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=tennoji, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TENNOJI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMAX, code=VB_10Q_Plus, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=VB_10Q_Plus, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val VB_10Q_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UMAX, code=Visionbook_10Q_Pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=Visionbook_10Q_Pro,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val VISIONBOOK_10Q_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UMAX, code=10A_3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=10A_3G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val _10A_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMAX, code=10A_LTE, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=10A_LTE, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _10A_LTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UMAX, code=10C_LTE, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=10C_LTE, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val _10C_LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UMAX, code=10C-LTE-A11, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=10C-LTE-A11, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val _10C_LTE_A11 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UMAX, code=10C-PRO-LTE, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=10C-PRO-LTE, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val _10C_PRO_LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UMAX, code=10L-PLUS, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=10L-PLUS, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _10L_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UMAX, code=10T-LTE_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=10T-LTE_EEA, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val _10T_LTE_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UMAX, code=11T-LTE-Pro_EEA, width=1200, height=2000, dpi=314,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=11T-LTE-Pro_EEA,
      width=1200, height=2000, dpi=314, isGoogleDevice=false).code */
      val _11T_LTE_PRO_EEA = "spec:width=1200,height=2000,unit=px,dpi=314"

      /** DeviceSpec(manufacturer=UMAX, code=7A_3G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=7A_3G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val _7A_3G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMAX, code=7A_Plus, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=7A_Plus, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val _7A_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UMAX, code=8A_Plus_eea, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=8A_Plus_eea, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _8A_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UMAX, code=8C_LTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=8C_LTE, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val _8C_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UMAX, code=8L_PLUS_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UMAX, code=8L_PLUS_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _8L_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
