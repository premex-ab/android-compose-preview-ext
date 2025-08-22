package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DSIC device specifications for Android Compose previews.
 *
 * This extension provides DSIC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DSIC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DSIC: Any
  get() = object {
      /** DeviceSpec(manufacturer=DSIC, code=ds6, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DSIC, code=ds6, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DS6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DSIC, code=DS60S, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DSIC, code=DS60S, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val DS60S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DSIC, code=RD86QE, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DSIC, code=RD86QE, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RD86QE = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
