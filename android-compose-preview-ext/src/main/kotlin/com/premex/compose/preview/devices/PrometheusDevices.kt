package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PROMETHEUS device specifications for Android Compose previews.
 *
 * This extension provides PROMETHEUS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Prometheus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Prometheus: Any
  get() = object {
      /** PROMETHEUS stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
