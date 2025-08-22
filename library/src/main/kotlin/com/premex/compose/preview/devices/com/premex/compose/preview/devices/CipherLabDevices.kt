package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CipherLab device specifications for Android Compose previews.
 *
 * This extension provides CipherLab device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CipherLab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CipherLab: Any
  get() = object {
      /** DeviceSpec(manufacturer=CipherLab, code=RK25, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CipherLab, code=RK25, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val RK25 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CipherLab, code=RK25WO, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CipherLab, code=RK25WO, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val RK25WO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CipherLab, code=RK26, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CipherLab, code=RK26, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val RK26 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CipherLab, code=RK95, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CipherLab, code=RK95, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val RK95 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CipherLab, code=RS10, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CipherLab, code=RS10, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val RS10 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=CipherLab, code=RS31, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CipherLab, code=RS31, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RS31 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CipherLab, code=RS35, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CipherLab, code=RS35, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RS35 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CipherLab, code=RS36, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CipherLab, code=RS36, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RS36 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CipherLab, code=RS38, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CipherLab, code=RS38, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val RS38 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CipherLab, code=RS51_HS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CipherLab, code=RS51_HS, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RS51_HS = "spec:width=720,height=1280,unit=px,dpi=320"

  }
