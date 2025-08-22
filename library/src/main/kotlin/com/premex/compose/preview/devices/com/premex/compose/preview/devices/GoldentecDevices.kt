package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Goldentec device specifications for Android Compose previews.
 *
 * This extension provides Goldentec device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Goldentec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Goldentec: Any
  get() = object {
      /** DeviceSpec(manufacturer=Goldentec, code=GT_METAL_TAB10, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Goldentec, code=GT_METAL_TAB10,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val GT_METAL_TAB10 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Goldentec, code=GT_TAB10, width=800, height=1280, dpi=178,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Goldentec, code=GT_TAB10,
      width=800, height=1280, dpi=178, isGoogleDevice=false).code */
      val GT_TAB10 = "spec:width=800,height=1280,unit=px,dpi=178"

      /** DeviceSpec(manufacturer=Goldentec, code=GT_TAB7, width=600, height=1024, dpi=192,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Goldentec, code=GT_TAB7, width=600,
      height=1024, dpi=192, isGoogleDevice=false).code */
      val GT_TAB7 = "spec:width=600,height=1024,unit=px,dpi=192"

  }
