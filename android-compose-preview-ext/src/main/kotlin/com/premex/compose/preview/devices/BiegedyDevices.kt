package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Biegedy device specifications for Android Compose previews.
 *
 * This extension provides Biegedy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Biegedy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Biegedy: Any
  get() = object {
      /** Biegedy B21_EEA */
      val B21_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Biegedy B22_EEA */
      val B22_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Biegedy B22_US */
      val B22_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Biegedy B23_U_EEA */
      val B23_U_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Biegedy B29_EEA */
      val B29_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Biegedy B29_US */
      val B29_US = "spec:width=800,height=1280,unit=px,dpi=213"

  }
