package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EPSON device specifications for Android Compose previews.
 *
 * This extension provides EPSON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EPSON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EPSON: Any
  get() = object {
      /** DeviceSpec(manufacturer=EPSON, code=himalaya, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPSON, code=himalaya, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HIMALAYA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EPSON, code=sti6290d101, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPSON, code=sti6290d101,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val STI6290D101 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
