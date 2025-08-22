package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FORCO device specifications for Android Compose previews.
 *
 * This extension provides FORCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FORCO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FORCO: Any
  get() = object {
      /** DeviceSpec(manufacturer=FORCO, code=K1028G, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FORCO, code=K1028G, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val K1028G = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
