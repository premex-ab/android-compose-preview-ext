package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Doro device specifications for Android Compose previews.
 *
 * This extension provides Doro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Doro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Doro: Any
  get() = object {
      /** DeviceSpec(manufacturer=Doro, code=Doro_8020x, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=Doro_8020x, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val DORO_8020X = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Doro, code=DSB0010, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=DSB0010, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val DSB0010 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Doro, code=DSB0090, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=DSB0090, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DSB0090 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Doro, code=DSB0170, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=DSB0170, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DSB0170 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Doro, code=DSB0220, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=DSB0220, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val DSB0220 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Doro, code=DSB0230, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=DSB0230, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val DSB0230 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Doro, code=DSB0400, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=DSB0400, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val DSB0400 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Doro, code=DSB0440, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=DSB0440, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val DSB0440 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Doro, code=DSB0550, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=DSB0550, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DSB0550 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Doro, code=DSB0560, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=DSB0560, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val DSB0560 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Doro, code=DSC0540, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=DSC0540, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DSC0540 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Doro, code=DTO0410, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=DTO0410, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val DTO0410 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Doro, code=Liberto820, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=Liberto820, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LIBERTO820 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Doro, code=820Mini, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=820Mini, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val _820MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Doro, code=825A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Doro, code=825A, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val _825A = "spec:width=720,height=1280,unit=px,dpi=320"

  }
