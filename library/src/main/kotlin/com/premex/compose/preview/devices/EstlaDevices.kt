package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Estla device specifications for Android Compose previews.
 *
 * This extension provides Estla device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Estla.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Estla: Any
  get() = object {
      /** Estla sindorim */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
