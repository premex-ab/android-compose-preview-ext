package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MasterG device specifications for Android Compose previews.
 *
 * This extension provides MasterG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MasterG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MasterG: Any
  get() = object {
      /** MasterG mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MasterG pioneer */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
