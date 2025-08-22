package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * sico device specifications for Android Compose previews.
 *
 * This extension provides sico device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sico.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sico: Any
  get() = object {
      /** sico Plus2_4G */
      val PLUS2_4G = "spec:width=480,height=854,unit=px,dpi=240"

  }
