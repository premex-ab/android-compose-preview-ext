package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Noblex device specifications for Android Compose previews.
 *
 * This extension provides Noblex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Noblex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Noblex: Any
  get() = object {
      /** DeviceSpec(manufacturer=Noblex, code=anaheim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Noblex, code=anaheim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Noblex, code=shinjuku, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Noblex, code=shinjuku, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHINJUKU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Noblex, code=songshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Noblex, code=songshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Noblex, code=SW4H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Noblex, code=SW4H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Noblex, code=SW6H, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Noblex, code=SW6H, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
