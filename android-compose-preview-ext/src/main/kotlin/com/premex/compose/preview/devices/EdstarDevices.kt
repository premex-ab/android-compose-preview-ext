package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EDSTAR device specifications for Android Compose previews.
 *
 * This extension provides EDSTAR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Edstar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Edstar: Any
  get() = object {
      /** EDSTAR LC-TS08S */
      val LC_TS08S = "spec:width=800,height=1280,unit=px,dpi=213"

  }
