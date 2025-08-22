package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Xelex device specifications for Android Compose previews.
 *
 * This extension provides Xelex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xelex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xelex: Any
  get() = object {
      /** Xelex Gama_Tab_X8 */
      val GAMA_TAB_X8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
