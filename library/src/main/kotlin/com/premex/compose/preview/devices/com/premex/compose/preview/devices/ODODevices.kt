package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ODO device specifications for Android Compose previews.
 *
 * This extension provides ODO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ODO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ODO: Any
  get() = object {
      /** DeviceSpec(manufacturer=ODO, code=A7008, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ODO, code=A7008, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val A7008 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
