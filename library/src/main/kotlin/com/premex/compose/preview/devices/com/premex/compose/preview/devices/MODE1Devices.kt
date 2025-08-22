package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MODE-1 device specifications for Android Compose previews.
 *
 * This extension provides MODE-1 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MODE1.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MODE1: Any
  get() = object {
      /** DeviceSpec(manufacturer=MODE-1, code=MD-05P, width=576, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MODE-1, code=MD-05P, width=576,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MD_05P = "spec:width=576,height=1440,unit=px,dpi=320"

  }
