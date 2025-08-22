package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PIPO device specifications for Android Compose previews.
 *
 * This extension provides PIPO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pipo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pipo: Any
  get() = object {
      /** PIPO IconX_P109 */
      val ICONX_P109 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
