package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ENDO device specifications for Android Compose previews.
 *
 * This extension provides ENDO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Endo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Endo: Any
  get() = object {
      /** ENDO FX438NA */
      val FX438NA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
