package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Digiland device specifications for Android Compose previews.
 *
 * This extension provides Digiland device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Digiland.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Digiland: Any
  get() = object {
      /** DeviceSpec(manufacturer=Digiland, code=DL1001, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digiland, code=DL1001, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val DL1001 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Digiland, code=DL1050, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digiland, code=DL1050, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DL1050 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Digiland, code=mid1008, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digiland, code=mid1008, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID1008 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Digiland, code=mid1016, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digiland, code=mid1016, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MID1016 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Digiland, code=mid1016_ma, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digiland, code=mid1016_ma,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MID1016_MA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Digiland, code=mid1032_mr_32, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digiland, code=mid1032_mr_32,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MID1032_MR_32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Digiland, code=mid1109_mx, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digiland, code=mid1109_mx,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MID1109_MX = "spec:width=800,height=1280,unit=px,dpi=160"

  }
