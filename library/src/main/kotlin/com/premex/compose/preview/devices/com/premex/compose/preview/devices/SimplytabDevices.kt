package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Simplytab device specifications for Android Compose previews.
 *
 * This extension provides Simplytab device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Simplytab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Simplytab: Any
  get() = object {
      /** DeviceSpec(manufacturer=Simplytab, code=S-101TAB, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Simplytab, code=S-101TAB,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val S_101TAB = "spec:width=800,height=1280,unit=px,dpi=160"

  }
