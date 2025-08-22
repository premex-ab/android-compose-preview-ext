package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DGO device specifications for Android Compose previews.
 *
 * This extension provides DGO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DGO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DGO: Any
  get() = object {
      /** DeviceSpec(manufacturer=DGO, code=HP46D, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DGO, code=HP46D, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val HP46D = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
