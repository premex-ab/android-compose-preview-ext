package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VolvoCars device specifications for Android Compose previews.
 *
 * This extension provides VolvoCars device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VolvoCars.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VolvoCars: Any
  get() = object {
      /** DeviceSpec(manufacturer=VolvoCars, code=habanero, width=1200, height=1600, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VolvoCars, code=habanero,
      width=1200, height=1600, dpi=180, isGoogleDevice=false).code */
      val HABANERO = "spec:width=1200,height=1600,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=VolvoCars, code=ihu_abl_car, width=768, height=1024, dpi=140,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VolvoCars, code=ihu_abl_car,
      width=768, height=1024, dpi=140, isGoogleDevice=false).code */
      val IHU_ABL_CAR = "spec:width=768,height=1024,unit=px,dpi=140"

      /** DeviceSpec(manufacturer=VolvoCars, code=moose, width=1600, height=2560, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VolvoCars, code=moose, width=1600,
      height=2560, dpi=200, isGoogleDevice=false).code */
      val MOOSE = "spec:width=1600,height=2560,unit=px,dpi=200"

  }
