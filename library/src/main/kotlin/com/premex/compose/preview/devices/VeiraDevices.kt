package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VEIRA device specifications for Android Compose previews.
 *
 * This extension provides VEIRA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Veira.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Veira: Any
  get() = object {
      /** VEIRA mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

  }
