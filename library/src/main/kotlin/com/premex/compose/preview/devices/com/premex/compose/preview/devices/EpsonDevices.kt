package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Epson device specifications for Android Compose previews.
 *
 * This extension provides Epson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Epson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Epson: Any
  get() = object {
      /** DeviceSpec(manufacturer=Epson, code=Bushi, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Epson, code=Bushi, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BUSHI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Epson, code=embt4, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Epson, code=embt4, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val EMBT4 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Epson, code=sti6200d101, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Epson, code=sti6200d101,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val STI6200D101 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Epson, code=sti6202d101, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Epson, code=sti6202d101,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val STI6202D101 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
