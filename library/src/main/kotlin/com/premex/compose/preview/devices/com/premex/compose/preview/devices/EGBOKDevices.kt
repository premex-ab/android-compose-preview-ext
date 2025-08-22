package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EGBOK device specifications for Android Compose previews.
 *
 * This extension provides EGBOK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EGBOK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EGBOK: Any
  get() = object {
      /** DeviceSpec(manufacturer=EGBOK, code=P803, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EGBOK, code=P803, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P803 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
