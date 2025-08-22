package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LNMBBS device specifications for Android Compose previews.
 *
 * This extension provides LNMBBS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LNMBBS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LNMBBS: Any
  get() = object {
      /** DeviceSpec(manufacturer=LNMBBS, code=H11-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LNMBBS, code=H11-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val H11_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LNMBBS, code=L20, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LNMBBS, code=L20, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val L20 = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=LNMBBS, code=L201-EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LNMBBS, code=L201-EEA, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val L201_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LNMBBS, code=L20-EEA, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LNMBBS, code=L20-EEA, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val L20_EEA = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LNMBBS, code=L211, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LNMBBS, code=L211, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val L211 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LNMBBS, code=L23, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LNMBBS, code=L23, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L23 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LNMBBS, code=L23-EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LNMBBS, code=L23-EEA, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val L23_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=LNMBBS, code=L28-EEA, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LNMBBS, code=L28-EEA, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val L28_EEA = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=LNMBBS, code=L60, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LNMBBS, code=L60, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val L60 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LNMBBS, code=L80_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LNMBBS, code=L80_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val L80_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LNMBBS, code=P401, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LNMBBS, code=P401, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P401 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LNMBBS, code=P40-EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LNMBBS, code=P40-EEA, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P40_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
