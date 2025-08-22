package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VORTEX device specifications for Android Compose previews.
 *
 * This extension provides VORTEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VORTEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VORTEX: Any
  get() = object {
      /** DeviceSpec(manufacturer=VORTEX, code=BTAB10, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORTEX, code=BTAB10, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val BTAB10 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=VORTEX, code=CM62, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORTEX, code=CM62, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val CM62 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=VORTEX, code=PG65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORTEX, code=PG65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PG65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VORTEX, code=SYNQ, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORTEX, code=SYNQ, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SYNQ = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VORTEX, code=VortexV20, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORTEX, code=VortexV20, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val VORTEXV20 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VORTEX, code=VORTEX_HD65_Choice, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VORTEX, code=VORTEX_HD65_Choice,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val VORTEX_HD65_CHOICE = "spec:width=720,height=1600,unit=px,dpi=320"

  }
