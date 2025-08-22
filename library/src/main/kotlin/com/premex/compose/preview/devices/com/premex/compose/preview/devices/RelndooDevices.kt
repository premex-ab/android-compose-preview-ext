package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Relndoo device specifications for Android Compose previews.
 *
 * This extension provides Relndoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Relndoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Relndoo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Relndoo, code=P60_EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=P60_EEA, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P60_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Relndoo, code=P60_ROW, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=P60_ROW, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P60_ROW = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Relndoo, code=P60_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=P60_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P60_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Relndoo, code=P80, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=P80, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Relndoo, code=P80_EU, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=P80_EU, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P80_EU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Relndoo, code=P80_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=P80_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P80_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Relndoo, code=T10P, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=T10P, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T10P = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Relndoo, code=T10P_A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=T10P_A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T10P_A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Relndoo, code=T10P_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=T10P_ROW, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val T10P_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Relndoo, code=T618, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=T618, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T618 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Relndoo, code=T618_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=T618_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T618_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Relndoo, code=T618_WIFI, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=T618_WIFI, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T618_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Relndoo, code=T618_WIFI_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=T618_WIFI_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val T618_WIFI_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Relndoo, code=T88, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=T88, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T88 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Relndoo, code=TAB10_EU, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=TAB10_EU, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val TAB10_EU = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Relndoo, code=TAB10_EUR, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=TAB10_EUR, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB10_EUR = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Relndoo, code=TB02, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=TB02, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TB02 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Relndoo, code=TB02_EUR, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=TB02_EUR, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TB02_EUR = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Relndoo, code=TB02_ROW, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Relndoo, code=TB02_ROW, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TB02_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

  }
