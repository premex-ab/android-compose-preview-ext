package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Electroneum device specifications for Android Compose previews.
 *
 * This extension provides Electroneum device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Electroneum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Electroneum: Any
  get() = object {
      /** DeviceSpec(manufacturer=Electroneum, code=electroneumM1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Electroneum, code=electroneumM1,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ELECTRONEUMM1 = "spec:width=480,height=854,unit=px,dpi=240"

  }
