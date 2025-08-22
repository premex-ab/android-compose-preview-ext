package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BMAX device specifications for Android Compose previews.
 *
 * This extension provides BMAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BMAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BMAX: Any
  get() = object {
      /** DeviceSpec(manufacturer=BMAX, code=BMAX_I9, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=BMAX_I9, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val BMAX_I9 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BMAX, code=I10, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val I10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BMAX, code=I10Pro_LTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10Pro_LTE, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val I10PRO_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I10Pro_LTE_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10Pro_LTE_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val I10PRO_LTE_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I10_EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10_EEA, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val I10_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BMAX, code=I10_LTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10_LTE, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val I10_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I10_Plus, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10_Plus, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val I10_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I10_Plus_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10_Plus_EEA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val I10_PLUS_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BMAX, code=I10_Plus_LTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10_Plus_LTE, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val I10_PLUS_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I10_Plus_WLAN, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10_Plus_WLAN,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val I10_PLUS_WLAN = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I10_Pro_EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10_Pro_EEA, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val I10_PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BMAX, code=I10_Pro_LTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10_Pro_LTE, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val I10_PRO_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I10_Pro_LTE_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10_Pro_LTE_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val I10_PRO_LTE_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I10_Pro_ROW, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10_Pro_ROW, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val I10_PRO_ROW = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BMAX, code=I10_S_Pro, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I10_S_Pro, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val I10_S_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BMAX, code=I11, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I11, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val I11 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BMAX, code=I11_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I11_EEA, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val I11_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BMAX, code=I11_LTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I11_LTE, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val I11_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I11_Plus, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I11_Plus, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val I11_PLUS = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BMAX, code=I11_Plus_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I11_Plus_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val I11_PLUS_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BMAX, code=I11_Plus_LTE, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I11_Plus_LTE,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val I11_PLUS_LTE = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BMAX, code=I11_Plus_LTE_EEA, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I11_Plus_LTE_EEA,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val I11_PLUS_LTE_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BMAX, code=I11_Power, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I11_Power, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val I11_POWER = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BMAX, code=I11_Power_LTE, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I11_Power_LTE,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val I11_POWER_LTE = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BMAX, code=I11_S, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I11_S, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val I11_S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I8, width=1536, height=2048, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I8, width=1536,
      height=2048, dpi=240, isGoogleDevice=false).code */
      val I8 = "spec:width=1536,height=2048,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BMAX, code=I8_Plus, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I8_Plus, width=800,
      height=1340, dpi=213, isGoogleDevice=false).code */
      val I8_PLUS = "spec:width=800,height=1340,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I9_Plus_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I9_Plus_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val I9_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I9_Plus_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I9_Plus_ROW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val I9_PLUS_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I9_Plus_WIFIOnly, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I9_Plus_WIFIOnly,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val I9_PLUS_WIFIONLY = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BMAX, code=I9_Plus_WIFI_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I9_Plus_WIFI_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val I9_PLUS_WIFI_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BMAX, code=I9_Plus_WIFI_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I9_Plus_WIFI_ROW,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val I9_PLUS_WIFI_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=BMAX, code=I9_Plus_WLAN, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I9_Plus_WLAN, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val I9_PLUS_WLAN = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BMAX, code=I9_Plus_Wlanonly, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I9_Plus_Wlanonly,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val I9_PLUS_WLANONLY = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BMAX, code=I9_Plus_Wlanonly_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I9_Plus_Wlanonly_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val I9_PLUS_WLANONLY_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BMAX, code=I9_Plus_WLAN_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMAX, code=I9_Plus_WLAN_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val I9_PLUS_WLAN_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
