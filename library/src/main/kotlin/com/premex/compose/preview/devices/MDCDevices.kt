package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MDC device specifications for Android Compose previews.
 *
 * This extension provides MDC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MDC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MDC: Any
  get() = object {
      /** MDC Prime_S */
      val PRIME_S = "spec:width=720,height=1280,unit=px,dpi=320"

  }
