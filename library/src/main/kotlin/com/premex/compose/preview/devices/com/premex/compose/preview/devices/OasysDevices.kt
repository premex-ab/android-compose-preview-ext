package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Oasys device specifications for Android Compose previews.
 *
 * This extension provides Oasys device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Oasys.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Oasys: Any
  get() = object {
      /** DeviceSpec(manufacturer=Oasys, code=TEG9300, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Oasys, code=TEG9300, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TEG9300 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
