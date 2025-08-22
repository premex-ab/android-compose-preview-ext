package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Supertab device specifications for Android Compose previews.
 *
 * This extension provides Supertab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Supertab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Supertab: Any
  get() = object {
      /** Supertab K7_KIDS */
      val K7_KIDS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Supertab 16G4H101 */
      val _16G4H101 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
