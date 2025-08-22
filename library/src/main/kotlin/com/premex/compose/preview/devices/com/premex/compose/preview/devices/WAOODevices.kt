package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WAOO device specifications for Android Compose previews.
 *
 * This extension provides WAOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WAOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WAOO: Any
  get() = object {
      /** DeviceSpec(manufacturer=WAOO, code=m393gena_w, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WAOO, code=m393gena_w, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val M393GENA_W = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
