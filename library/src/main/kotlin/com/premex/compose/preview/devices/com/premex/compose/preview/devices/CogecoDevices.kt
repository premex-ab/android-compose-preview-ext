package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cogeco device specifications for Android Compose previews.
 *
 * This extension provides Cogeco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cogeco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cogeco: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cogeco, code=m393gena_c, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cogeco, code=m393gena_c,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val M393GENA_C = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
