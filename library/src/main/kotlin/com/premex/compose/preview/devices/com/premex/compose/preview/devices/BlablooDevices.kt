package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Blabloo device specifications for Android Compose previews.
 *
 * This extension provides Blabloo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blabloo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blabloo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Blabloo, code=Space1Blue, width=540, height=1132, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blabloo, code=Space1Blue,
      width=540, height=1132, dpi=240, isGoogleDevice=false).code */
      val SPACE1BLUE = "spec:width=540,height=1132,unit=px,dpi=240"

  }
