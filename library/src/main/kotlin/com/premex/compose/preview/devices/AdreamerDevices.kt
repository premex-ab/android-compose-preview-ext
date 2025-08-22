package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Adreamer device specifications for Android Compose previews.
 *
 * This extension provides Adreamer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Adreamer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Adreamer: Any
  get() = object {
      /** Adreamer KidsPad10X */
      val KIDSPAD10X = "spec:width=800,height=1280,unit=px,dpi=200"

      /** Adreamer LeoPad20 */
      val LEOPAD20 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Adreamer LeoPad_10X */
      val LEOPAD_10X = "spec:width=800,height=1280,unit=px,dpi=200"

  }
