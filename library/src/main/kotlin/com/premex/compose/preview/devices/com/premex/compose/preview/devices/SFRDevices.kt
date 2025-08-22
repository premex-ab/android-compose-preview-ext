package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SFR device specifications for Android Compose previews.
 *
 * This extension provides SFR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SFR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SFR: Any
  get() = object {
      /** DeviceSpec(manufacturer=SFR, code=DIW377_ALT_FR, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SFR, code=DIW377_ALT_FR,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DIW377_ALT_FR = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SFR, code=DV8219, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SFR, code=DV8219, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8219 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SFR, code=DV8555-SFR, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SFR, code=DV8555-SFR, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8555_SFR = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SFR, code=DV8945-KFS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SFR, code=DV8945-KFS, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8945_KFS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SFR, code=msm8916_32, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SFR, code=msm8916_32, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val MSM8916_32 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
