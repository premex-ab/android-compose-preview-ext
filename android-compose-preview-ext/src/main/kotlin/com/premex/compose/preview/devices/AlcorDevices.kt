package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Alcor device specifications for Android Compose previews.
 *
 * This extension provides Alcor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alcor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alcor: Any
  get() = object {
      /** Alcor Comet_O118LR */
      val COMET_O118LR = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
