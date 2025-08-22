package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TeloSystems device specifications for Android Compose previews.
 *
 * This extension provides TeloSystems device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TeloSystems.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TeloSystems: Any
  get() = object {
      /** DeviceSpec(manufacturer=TeloSystems, code=TE580P, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TeloSystems, code=TE580P,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val TE580P = "spec:width=480,height=800,unit=px,dpi=240"

  }
