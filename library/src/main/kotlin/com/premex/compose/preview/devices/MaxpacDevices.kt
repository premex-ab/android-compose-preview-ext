package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Maxpac device specifications for Android Compose previews.
 *
 * This extension provides Maxpac device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maxpac.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maxpac: Any
  get() = object {
      /** Maxpac Parrot_3G */
      val PARROT_3G = "spec:width=600,height=1024,unit=px,dpi=160"

  }
