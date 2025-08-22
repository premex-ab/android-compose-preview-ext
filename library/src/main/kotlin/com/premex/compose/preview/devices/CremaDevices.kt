package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Crema device specifications for Android Compose previews.
 *
 * This extension provides Crema device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Crema.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Crema: Any
  get() = object {
      /** Crema crema0810t */
      val CREMA0810T = "spec:width=768,height=1024,unit=px,dpi=160"

  }
