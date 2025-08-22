package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * INCO device specifications for Android Compose previews.
 *
 * This extension provides INCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.INCO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.INCO: Any
  get() = object {
      /** INCO Horizon */
      val HORIZON = "spec:width=480,height=996,unit=px,dpi=240"

  }
