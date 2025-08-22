package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ITELL device specifications for Android Compose previews.
 *
 * This extension provides ITELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ITELL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ITELL: Any
  get() = object {
      /** ITELL ITELL_K4700Q */
      val ITELL_K4700Q = "spec:width=600,height=1024,unit=px,dpi=213"

  }
