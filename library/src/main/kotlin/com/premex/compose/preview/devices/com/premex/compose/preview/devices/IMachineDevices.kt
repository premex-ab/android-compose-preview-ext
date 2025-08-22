package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iMachine device specifications for Android Compose previews.
 *
 * This extension provides iMachine device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IMachine.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IMachine: Any
  get() = object {
      /** DeviceSpec(manufacturer=iMachine, code=i2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iMachine, code=i2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I2 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
