package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEO device specifications for Android Compose previews.
 *
 * This extension provides NEO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NEO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NEO: Any
  get() = object {
      /** DeviceSpec(manufacturer=NEO, code=GF214-NEO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEO, code=GF214-NEO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GF214_NEO = "spec:width=800,height=1280,unit=px,dpi=160"

  }
