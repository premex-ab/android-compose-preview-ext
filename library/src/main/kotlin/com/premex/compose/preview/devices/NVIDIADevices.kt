package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NVIDIA device specifications for Android Compose previews.
 *
 * This extension provides NVIDIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NVIDIA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NVIDIA: Any
  get() = object {
      /** NVIDIA darcy */
      val DARCY = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** NVIDIA foster */
      val FOSTER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** NVIDIA mdarcy */
      val MDARCY = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** NVIDIA sif */
      val SIF = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
