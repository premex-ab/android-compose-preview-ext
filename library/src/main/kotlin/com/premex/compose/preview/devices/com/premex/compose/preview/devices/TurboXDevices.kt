package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Turbo-X device specifications for Android Compose previews.
 *
 * This extension provides Turbo-X device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TurboX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TurboX: Any
  get() = object {
      /** DeviceSpec(manufacturer=Turbo-X, code=Aqua, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Turbo-X, code=Aqua, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AQUA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Turbo-X, code=Fire, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Turbo-X, code=Fire, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val FIRE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Turbo-X, code=Fire_II_WiFi, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Turbo-X, code=Fire_II_WiFi,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val FIRE_II_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

  }
