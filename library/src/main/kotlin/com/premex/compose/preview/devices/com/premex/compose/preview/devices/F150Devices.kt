package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * F150 device specifications for Android Compose previews.
 *
 * This extension provides F150 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.F150.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.F150: Any
  get() = object {
      /** DeviceSpec(manufacturer=F150, code=Air1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F150, code=Air1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val AIR1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=F150, code=Air1_Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F150, code=Air1_Pro, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val AIR1_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=F150, code=B1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F150, code=B1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val B1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=F150, code=B1_Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F150, code=B1_Pro, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val B1_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=F150, code=B2021, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F150, code=B2021, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val B2021 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=F150, code=Bison2021, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F150, code=Bison2021, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val BISON2021 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=F150, code=H2022, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F150, code=H2022, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val H2022 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=F150, code=R2022, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F150, code=R2022, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val R2022 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
