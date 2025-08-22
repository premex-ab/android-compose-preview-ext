package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * eTera device specifications for Android Compose previews.
 *
 * This extension provides eTera device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ETera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ETera: Any
  get() = object {
      /** DeviceSpec(manufacturer=eTera, code=E980U, width=240, height=320, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eTera, code=E980U, width=240,
      height=320, dpi=120, isGoogleDevice=false).code */
      val E980U = "spec:width=240,height=320,unit=px,dpi=120"

  }
