package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * A1 device specifications for Android Compose previews.
 *
 * This extension provides A1 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.A1.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.A1: Any
  get() = object {
      /** DeviceSpec(manufacturer=A1, code=DV9161-KBA, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=A1, code=DV9161-KBA, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DV9161_KBA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=A1, code=P671F60, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=A1, code=P671F60, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val P671F60 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=A1, code=P963F01D, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=A1, code=P963F01D, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val P963F01D = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=A1, code=VFD720, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=A1, code=VFD720, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val VFD720 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
