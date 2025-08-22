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
 * @Preview(device = Devices.Voto.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Voto: Any
  get() = object {
      /** VOTO VOTO_V2i */
      val VOTO_V2I = "spec:width=720,height=1280,unit=px,dpi=320"

  }
