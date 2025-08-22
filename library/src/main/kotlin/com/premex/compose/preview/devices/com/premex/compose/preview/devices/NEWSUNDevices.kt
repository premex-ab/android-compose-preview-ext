package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEWSUN device specifications for Android Compose previews.
 *
 * This extension provides NEWSUN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NEWSUN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NEWSUN: Any
  get() = object {
      /** DeviceSpec(manufacturer=NEWSUN, code=S20, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEWSUN, code=S20, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val S20 = "spec:width=600,height=1280,unit=px,dpi=240"

  }
