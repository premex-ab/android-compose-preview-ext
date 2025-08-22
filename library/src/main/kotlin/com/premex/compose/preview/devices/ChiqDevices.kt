package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CHiQ device specifications for Android Compose previews.
 *
 * This extension provides CHiQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Chiq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Chiq: Any
  get() = object {
      /** CHiQ dundas */
      val DUNDAS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CHiQ longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CHiQ redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** CHiQ samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CHiQ sindorim */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
