package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SVITOO device specifications for Android Compose previews.
 *
 * This extension provides SVITOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SVITOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SVITOO: Any
  get() = object {
      /** DeviceSpec(manufacturer=SVITOO, code=P08, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SVITOO, code=P08, width=800,
      height=1340, dpi=213, isGoogleDevice=false).code */
      val P08 = "spec:width=800,height=1340,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SVITOO, code=P10, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SVITOO, code=P10, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val P10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=SVITOO, code=P11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SVITOO, code=P11, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SVITOO, code=P11_pro_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SVITOO, code=P11_pro_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val P11_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SVITOO, code=SVITOO_P10, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SVITOO, code=SVITOO_P10, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val SVITOO_P10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=SVITOO, code=TAB_P12, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SVITOO, code=TAB_P12, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val TAB_P12 = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
