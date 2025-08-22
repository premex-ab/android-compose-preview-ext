package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sederick device specifications for Android Compose previews.
 *
 * This extension provides Sederick device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sederick.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sederick: Any
  get() = object {
      /** DeviceSpec(manufacturer=Sederick, code=KT101, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sederick, code=KT101, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KT101 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
