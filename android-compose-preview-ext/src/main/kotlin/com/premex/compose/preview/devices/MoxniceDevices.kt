package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MOXNICE device specifications for Android Compose previews.
 *
 * This extension provides MOXNICE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Moxnice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Moxnice: Any
  get() = object {
      /** MOXNICE P50-EEA */
      val P50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MOXNICE P50-ROW */
      val P50_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MOXNICE P63 */
      val P63 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
