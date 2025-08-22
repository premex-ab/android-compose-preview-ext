package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ProDVX device specifications for Android Compose previews.
 *
 * This extension provides ProDVX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ProDVX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ProDVX: Any
  get() = object {
      /** DeviceSpec(manufacturer=ProDVX, code=rk3399_Android11, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ProDVX, code=rk3399_Android11,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val RK3399_ANDROID11 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
