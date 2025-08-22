package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Formovie device specifications for Android Compose previews.
 *
 * This extension provides Formovie device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Formovie.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Formovie: Any
  get() = object {
      /** DeviceSpec(manufacturer=Formovie, code=koroli, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Formovie, code=koroli, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KOROLI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
