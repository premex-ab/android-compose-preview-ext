package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VOTO device specifications for Android Compose previews.
 *
 * This extension provides VOTO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VOTO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VOTO: Any
  get() = object {
      /** DeviceSpec(manufacturer=VOTO, code=VOTO_V2i, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VOTO, code=VOTO_V2i, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VOTO_V2I = "spec:width=720,height=1280,unit=px,dpi=320"

  }
