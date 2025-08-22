package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Scope device specifications for Android Compose previews.
 *
 * This extension provides Scope device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Scope.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Scope: Any
  get() = object {
      /** DeviceSpec(manufacturer=Scope, code=F503V, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Scope, code=F503V, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F503V = "spec:width=800,height=1280,unit=px,dpi=160"

  }
