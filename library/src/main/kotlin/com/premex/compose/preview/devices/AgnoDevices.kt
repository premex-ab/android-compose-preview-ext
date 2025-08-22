package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AGNO device specifications for Android Compose previews.
 *
 * This extension provides AGNO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Agno.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Agno: Any
  get() = object {
      /** AGNO TAIG717A */
      val TAIG717A = "spec:width=800,height=1340,unit=px,dpi=213"

  }
