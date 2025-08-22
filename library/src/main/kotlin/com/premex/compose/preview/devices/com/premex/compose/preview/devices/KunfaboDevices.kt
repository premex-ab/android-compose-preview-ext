package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kunfabo device specifications for Android Compose previews.
 *
 * This extension provides Kunfabo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kunfabo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kunfabo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kunfabo, code=F99Pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kunfabo, code=F99Pro, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val F99PRO = "spec:width=720,height=1520,unit=px,dpi=320"

  }
