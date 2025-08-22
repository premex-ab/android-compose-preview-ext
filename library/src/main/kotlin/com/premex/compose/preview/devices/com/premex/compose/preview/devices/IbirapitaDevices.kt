package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ibirapita device specifications for Android Compose previews.
 *
 * This extension provides Ibirapita device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ibirapita.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ibirapita: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ibirapita, code=A81F, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ibirapita, code=A81F, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A81F = "spec:width=800,height=1280,unit=px,dpi=160"

  }
