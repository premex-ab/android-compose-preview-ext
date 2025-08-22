package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Brandt device specifications for Android Compose previews.
 *
 * This extension provides Brandt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brandt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brandt: Any
  get() = object {
      /** DeviceSpec(manufacturer=Brandt, code=BPRIME, width=720, height=1498, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Brandt, code=BPRIME, width=720,
      height=1498, dpi=320, isGoogleDevice=false).code */
      val BPRIME = "spec:width=720,height=1498,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Brandt, code=BPRIMES, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Brandt, code=BPRIMES, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val BPRIMES = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Brandt, code=BSTAR, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Brandt, code=BSTAR, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BSTAR = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Brandt, code=BSTAR_PLUS, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Brandt, code=BSTAR_PLUS, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BSTAR_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Brandt, code=B-ONE, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Brandt, code=B-ONE, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val B_ONE = "spec:width=720,height=1500,unit=px,dpi=320"

  }
