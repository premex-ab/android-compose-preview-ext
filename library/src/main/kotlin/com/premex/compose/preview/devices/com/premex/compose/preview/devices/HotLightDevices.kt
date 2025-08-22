package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HotLight device specifications for Android Compose previews.
 *
 * This extension provides HotLight device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HotLight.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HotLight: Any
  get() = object {
      /** DeviceSpec(manufacturer=HotLight, code=TP1003, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HotLight, code=TP1003, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TP1003 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
