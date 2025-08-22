package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HEATZ device specifications for Android Compose previews.
 *
 * This extension provides HEATZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HEATZ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HEATZ: Any
  get() = object {
      /** HEATZ Z9910A */
      val Z9910A = "spec:width=800,height=1280,unit=px,dpi=213"

  }
