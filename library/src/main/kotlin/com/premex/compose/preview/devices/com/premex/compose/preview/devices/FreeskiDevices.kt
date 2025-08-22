package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Freeski device specifications for Android Compose previews.
 *
 * This extension provides Freeski device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Freeski.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Freeski: Any
  get() = object {
      /** DeviceSpec(manufacturer=Freeski, code=C12, width=800, height=1332, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Freeski, code=C12, width=800,
      height=1332, dpi=160, isGoogleDevice=false).code */
      val C12 = "spec:width=800,height=1332,unit=px,dpi=160"

  }
