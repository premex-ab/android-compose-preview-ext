package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Polestar device specifications for Android Compose previews.
 *
 * This extension provides Polestar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Polestar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Polestar: Any
  get() = object {
      /** DeviceSpec(manufacturer=Polestar, code=ihu_abl_car, width=1152, height=1536, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polestar, code=ihu_abl_car,
      width=1152, height=1536, dpi=180, isGoogleDevice=false).code */
      val IHU_ABL_CAR = "spec:width=1152,height=1536,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Polestar, code=jalapeno, width=1200, height=1920, dpi=140,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polestar, code=jalapeno,
      width=1200, height=1920, dpi=140, isGoogleDevice=false).code */
      val JALAPENO = "spec:width=1200,height=1920,unit=px,dpi=140"

      /** DeviceSpec(manufacturer=Polestar, code=moose, width=1600, height=2560, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polestar, code=moose, width=1600,
      height=2560, dpi=200, isGoogleDevice=false).code */
      val MOOSE = "spec:width=1600,height=2560,unit=px,dpi=200"

  }
