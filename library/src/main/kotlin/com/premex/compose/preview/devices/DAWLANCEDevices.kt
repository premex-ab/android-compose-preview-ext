package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DAWLANCE device specifications for Android Compose previews.
 *
 * This extension provides DAWLANCE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DAWLANCE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DAWLANCE: Any
  get() = object {
      /** DAWLANCE SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DAWLANCE umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
