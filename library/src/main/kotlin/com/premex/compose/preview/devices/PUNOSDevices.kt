package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PUNOS device specifications for Android Compose previews.
 *
 * This extension provides PUNOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PUNOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PUNOS: Any
  get() = object {
      /** PUNOS PTX1022G */
      val PTX1022G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PUNOS PTX822G */
      val PTX822G = "spec:width=800,height=1280,unit=px,dpi=180"

  }
