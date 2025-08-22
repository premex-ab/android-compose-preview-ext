package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ENDO device specifications for Android Compose previews.
 *
 * This extension provides ENDO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ENDO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ENDO: Any
  get() = object {
      /** DeviceSpec(manufacturer=ENDO, code=FX438NA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENDO, code=FX438NA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val FX438NA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
