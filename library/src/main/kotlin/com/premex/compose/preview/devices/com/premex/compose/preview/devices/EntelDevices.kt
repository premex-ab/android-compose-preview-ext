package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Entel device specifications for Android Compose previews.
 *
 * This extension provides Entel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Entel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Entel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Entel, code=DIW585, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Entel, code=DIW585, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DIW585 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Entel, code=DV8957X-KCE, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Entel, code=DV8957X-KCE,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8957X_KCE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
