package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RUIO device specifications for Android Compose previews.
 *
 * This extension provides RUIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RUIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RUIO: Any
  get() = object {
      /** DeviceSpec(manufacturer=RUIO, code=Blitz, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RUIO, code=Blitz, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val BLITZ = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RUIO, code=M671M4, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RUIO, code=M671M4, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M671M4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RUIO, code=M675M4, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RUIO, code=M675M4, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M675M4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RUIO, code=RUIO_S5006, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RUIO, code=RUIO_S5006, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val RUIO_S5006 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RUIO, code=RUIO_S518, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RUIO, code=RUIO_S518, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val RUIO_S518 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RUIO, code=S5506, width=540, height=1132, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RUIO, code=S5506, width=540,
      height=1132, dpi=240, isGoogleDevice=false).code */
      val S5506 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RUIO, code=S6501, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RUIO, code=S6501, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val S6501 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=RUIO, code=S6506, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RUIO, code=S6506, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S6506 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RUIO, code=S6518, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RUIO, code=S6518, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val S6518 = "spec:width=540,height=1200,unit=px,dpi=240"

  }
