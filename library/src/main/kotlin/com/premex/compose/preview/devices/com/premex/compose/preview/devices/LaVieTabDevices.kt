package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LaVieTab device specifications for Android Compose previews.
 *
 * This extension provides LaVieTab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LaVieTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LaVieTab: Any
  get() = object {
      /** DeviceSpec(manufacturer=LaVieTab, code=PC-TE307N1W, width=600, height=976, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LaVieTab, code=PC-TE307N1W,
      width=600, height=976, dpi=160, isGoogleDevice=false).code */
      val PC_TE307N1W = "spec:width=600,height=976,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LaVieTab, code=PC-TE510BAL, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LaVieTab, code=PC-TE510BAL,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val PC_TE510BAL = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LaVieTab, code=TE508BAW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LaVieTab, code=TE508BAW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TE508BAW = "spec:width=800,height=1280,unit=px,dpi=213"

  }
