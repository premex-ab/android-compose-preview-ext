package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * veidoo device specifications for Android Compose previews.
 *
 * This extension provides veidoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Veidoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Veidoo: Any
  get() = object {
      /** veidoo T30_Plus_EEA */
      val T30_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** veidoo T80_PLUS */
      val T80_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

  }
